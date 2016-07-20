package challenges.codility.p13

import spock.lang.Specification

/**
 * Created by rgordeev on 15.07.16.
 */
class SolutionSpec extends Specification {
    def "solution method exists"() {
        given: def solution = new Solution()
        expect: "solution method exists"
            solution.metaClass.respondsTo(solution, "solution")
    }

    def "solution is right on sample data"() {
        given: def solution = new Solution()
        expect: solution.solution(6, 11, 2) == 3
    }

    def "solution is right on extrem data"() {
        given: def solution = new Solution()
        expect: solution.solution(0, 0, 11) == 1
    }

    def "solution is right on 0 inputs"() {
        given: def solution = new Solution()
        expect: solution.solution(0, 1, 11) == 1
    }

    def "solution is right on empty range"() {
        given: def solution = new Solution()
        expect: solution.solution(10, 10, 5) == 1
    }

    def "solution is right on ones range"() {
        given: def solution = new Solution()
        expect: solution.solution(0, 2, 1) == 3
    }

    def "solution is right on ones1 range"() {
        given: def solution = new Solution()
        expect: solution.solution(9, 10, 1) == 2
    }
}
