[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-10-cipher-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-10-cipher-username)

# Lab 09 - Strings Review

## Lab Goal
This lab was designed to give you an opportunity to demonstrate your mastery of using and manipulating strings. *This is a major grade.*

## Instructions
There are 3 classes you need to edit; one for each cipher. You should use the CipherRunner class to test your ciphers.  You do not need to edit the CipherRunner class.

1. Reverse.java - This simple cipher just reverses the message to encode it. Another reversal decodes it.
   - Complete the `encode` and `decode` methods.
   - All spaces in the message should be removed, and the encoded message should be in all uppercase characters.
2. Rotation.java - This cipher is similar to the Caeser cipher. It accepts two parameters, the message and the shift amount. To encrypt the message you will shift each letter by the amount of the shift.  For example, shifting the letter A by 5 gives you the letter F ('A' + 5 = 'F'). To decrypt the message you reverse the shift.
   - Complete the `encode` and `decode` methods.
   - All spaces in the message should be removed, and the encoded message should be in all uppercase characters.
   - http://practicalcryptography.com/ciphers/caesar-cipher/
   - [Caesar Cipher on YouTube](https://www.youtube.com/watch?v=o6TPx1Co_wg)
3. Vigenere.java - This cipher is like a series of Caeser ciphers.  It accepts two parameters, the message and the key.
   - Complete the `encode` and `decode` methods.
   - All spaces in the message should be removed, and the encoded message should be in all uppercase characters.
   - http://practicalcryptography.com/ciphers/vigenere-gronsfeld-and-autokey-cipher/
   - [Vigenere Cipher on YouTube](https://www.youtube.com/watch?v=nf8ssVmJf78)

## Relevant ThinkJava Section
* [Strings](http://greenteapress.com/thinkjava6/html/thinkjava6010.html)

## Potentially Helpful Methods
* `String.toUpperCase()`
* `String.substring()`
* `String.length()`
* `String.equals()`
* `String.charAt()`
* `String.indexOf()`
* `Character.toString()`
* [All String methods](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
* [All Character methods](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 15 - Reverse encode works
* 15 - Reverse decode works
* 20 - Rotation encode works
* 20 - Rotation decode works
* 10 - Vigenere encode works
* 10 - Vigenere decode works
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
