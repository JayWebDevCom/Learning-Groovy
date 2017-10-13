import spock.lang.Specification

class MainTest extends Specification {
    def "Test division of numbers by 2"() {

        given: "Some number"
        def n = 150

        expect: "Dividing by 2 halves the number"
        n / 2 == 75

    }

    def "Test finding positive numbers"() {
        given: "A number helper"
        def helper = new JavaNumberHelper()

        when:
        def result = helper.findPositives(inputNums as int[])

        then: "I get positives"
        result == expected

        where:
        inputNums | expected
        []       |  []
        [-1, -2]   |  []
        [1,2,3,4,5,6,7,8,9] | [2,4,6,8]


    }
}
