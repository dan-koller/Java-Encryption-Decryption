# Java Encryption Decryption

This is a simple encryption and decryption program that uses a shifting and a unicode algorithm to encrypt and decrypt
messages. The program is written in Java and meant to be used from the command line.

## Requirements

To run the program, you need a Java Runtime Environment (JRE) installed on your system. If you want to build the program
from source, you need a JDK (Version 11 or higher) installed on your system.

## Get started

Download the JAR file or clone this repository, run `gradle build` and then run the program from the command line.
You can pass several arguments to the program to change the behavior. See the following table for the available
arguments:

| Argument | Description                               | Options                    |
|----------|-------------------------------------------|----------------------------|
| -mode    | Encrypts/decrypts the message             | enc (_default_), dec       |
| -data    | Data that to be processed                 | _Some text_                |
| -in      | Specify an input file to read from        | e.g. _file_in.txt_         |
| -out     | Specify a filename to write the result to | e.g. _file_out.txt_        |
| -alg     | Select what algorithm should be used      | shift (_default_), unicode |

- If there is no -mode, the program works in enc mode.
- If there is no -key, the program consider that key = 0.
- If there is no -data, and there is no -in the program assumes that the data is an empty string.
- If there is no -out argument, the program prints data to the standard output.
- If there are both -data and -in arguments, your program prefers -data over -in.

## Examples

Input:

```sh
java -jar jEncrypt.jar -mode enc -in my_secret_text.txt -out protected.txt -key 5 -alg unicode
```

Output:  
This command gets data from the file my_secret_text.txt, encrypt the data with the key 5, create a file called
protected.txt and write ciphertext to it.

Input:

```sh
java -jar jEncrypt.jar -mode enc -key 5 -data "Welcome to GitHub!" -alg unicode
```

Output:

```sh
\jqhtrj%yt%LnyMzg&
```

Input:

```sh
java -jar jEncrypt.jar -key 5 -alg unicode -data "\jqhtrj%yt%LnyMzg&" -mode dec
```

Output:

```sh
Welcome to GitHub!
```

## Technologies

- Java 11
- Gradle 7.5.1
- JUnit 5.8.1
