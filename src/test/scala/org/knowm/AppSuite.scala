package org.knowm

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AppSuite extends AnyFunSuite {
  test("App has a greeting") {
    assert(App.greeting() != null)
  }
}
