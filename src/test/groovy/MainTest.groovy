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
        def x = helper.findPositives([1,2,3,4,5,6,7,8,9] as int[])

        then: "I get positives"
        x == [2,4,6,8]
        x.size() == 4
    }
}
