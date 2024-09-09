package com.adjectivecolournoun.gradle

import com.adjectivecolournoun.jar.SimpleGreeter
import com.adjectivecolournoun.json.JsonGreeter
import com.codevineyard.helloworld.App
import java.util.Date // Unused import
import java.io.File // Unused import

class Greetz {

    static void main(String... args) {
        // Magic numbers
        int num = 42
        if (num == 42) {
            println "The answer to life, the universe, and everything"
        }

        // Large method: introducing unnecessary complexity
        performComplexOperation()

        // Duplicated code
        new SimpleGreeter().greet()
        new SimpleGreeter().greet()

        // Improper naming
        def x = new JsonGreeter()
        def y = new App()
        x.greet()
        println y.message
    }

    public static String performComplexOperation() {
        int result = 0
        for (int i = 0; i < 10; i++) {
            result += i
            if (i % 2 == 0) {
                println "Even number: $i"
            } else {
                println "Odd number: $i"
            }
        }
        println "Result of complex operation: $result"
        return "Result of complex operation: $result"
    }
}

