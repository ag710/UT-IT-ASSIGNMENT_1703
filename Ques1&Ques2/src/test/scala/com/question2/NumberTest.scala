package com.question2

import org.scalatest.flatspec.AnyFlatSpec

class NumberTest extends AnyFlatSpec {
  val obj= new Number
  "Factorial " should "be Positive" in{
    val result: Int= obj.factorialOf(5)
    assert(result==120)
  }
  "Factorial" should "return 1 if user input 0" in{
    val result: Int= obj.factorialOf(0)
    assert(result==1)
  }
  "Factorial" should "return 1 if user input is 1" in{
    val result: Int=obj.factorialOf(1)
    assert(result==1)
  }

  "Palindrome " should "return true if the user input the true palindrome number" in{
    val result= obj.isPalindrome(124421)
    assert(result==true)
  }
  "Palindrome" should "return false if the user input is not a palindrome " in{
    val result= obj.isPalindrome(345)
    assert(result==false)
  }
  "Palindrome" should "return true if the user input 0" in{
    val result = obj.isPalindrome((0))
    assert(result==true)
  }
  "Palindrome" should "return false if the user input is negative" in{
    val result = obj.isPalindrome(-1)
    assert(result==false)
  }
}
