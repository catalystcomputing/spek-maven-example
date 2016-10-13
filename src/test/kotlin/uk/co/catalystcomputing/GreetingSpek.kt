package uk.co.catalystcomputing

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.amshove.kluent.*

/**
 * Greeting test case.
 */
class GreetingSpek : Spek({

    describe("A greeter") {

        given("the name of a person") {
            it("should greet that person by name") {
                sayHi("Kotlin") shouldEqual "Hello Kotlin!"
            }
        }
        
        given("no name of anyone to greet") {
            it("should give a general greeting to the world") {
                sayHi() shouldEqual "Hello World!"
            }
        }
    }

})