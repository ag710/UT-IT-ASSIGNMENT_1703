package com.question1

import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidatorTest extends AnyFlatSpec {
  "password" should "be invalid as it contains space" in {
    val password = new PasswordValidations("raman@756")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any digit" in {
    val password = new PasswordValidations("Raman#Sharma")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is less than 8" in {
    val password = new PasswordValidations("Aman2$")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is more than 15" in {
    val password = new PasswordValidations("Raman@gautam2000")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any lowercase letter" in {
    val password = new PasswordValidations("RAGHAV@SINGH2")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any uppercase letter" in {
    val password = new PasswordValidations("raghav@raman2")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any special character" in {
    val password = new PasswordValidations("RameshTiwari2")
    assert(!password.passwordIsValid)
  }

  "password" should "be valid" in {
    val password = new PasswordValidations("Raman@Singh08")
    assert(password.passwordIsValid)
  }
}
