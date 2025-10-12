provider "aws" {
  region = "us-east-1"
}

resource "aws_s3_bucket" "lambda_bucket" {
  bucket = "calculadora-java-lambda-bucket"
}

resource "aws_s3_object" "lambda_jar" {
  bucket = aws_s3_bucket.lambda_bucket.bucket
  key    = "calculadora-java-1.0-SNAPSHOT.jar"
  source = "../target/calculadora-java-1.0-SNAPSHOT.jar"
}

resource "aws_iam_role" "lambda_exec" {
  name = "lambda_exec_role"
  assume_role_policy = jsonencode({
    Version = "2012-10-17"
    Statement = [{
      Action = "sts:AssumeRole"
      Effect = "Allow"
      Principal = {
        Service = "lambda.amazonaws.com"
      }
    }]
  })
}

resource "aws_iam_role_policy_attachment" "lambda_policy" {
  role       = aws_iam_role.lambda_exec.name
  policy_arn = "arn:aws:iam::aws:policy/service-role/AWSLambdaBasicExecutionRole"
}

resource "aws_lambda_function" "calculadora_lambda" {
  function_name = var.function_name
  runtime       = "java21"
  handler       = "org.example.Main::handleRequest"
  role          = aws_iam_role.lambda_exec.arn
  s3_bucket     = aws_s3_bucket.lambda_bucket.id
  s3_key        = aws_s3_object.lambda_jar.key

  depends_on = [aws_s3_object.lambda_jar]
}

