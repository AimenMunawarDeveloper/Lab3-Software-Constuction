/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

/**
 * RulesOf6005 represents the collaboration policy of 6.005 as described by the
 * general information on Stellar.
 */
public class RulesOf6005 {
     
    /**
     * Judge whether a given piece of code may be used in an assignment (problem
     * set or team project) or not, according to the 6.005 collaboration policy.
     * 
     * @param writtenByYourself true if the code in question was written by
     *        yourself or, in the case of a team project, your teammates,
     *        otherwise false.
     * @param availableToOthers if not writtenByYourself, whether or not the
     *        code in question is available to all other students in the class.
     *        Otherwise ignored.
     * @param writtenAsCourseWork if not writtenByYourself, whether or not the
     *        code in question was written specifically as part of a solution to
     *        a 6.005 assignment, in the current or past semesters. Otherwise
     *        ignored.
     * @param citingYourSource if not writtenByYourself, whether or not you
     *        properly cite your source. Otherwise ignored.
     * @param implementationRequired whether the assignment specifically asks
     *        you to implement the feature in question.
     * @return Whether or not, based on the information provided in the
     *         arguments, you are likely to be allowed to use the code in
     *         question in your assignment, according to the 6.005 collaboration
     *         policy for the current semester.
     */
    public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
            boolean availableToOthers, boolean writtenAsCourseWork,
            boolean citingYourSource, boolean implementationRequired) {
    	// "You may reuse designs, ideas and code from your own work earlier in the semester (even if it was done in a group project with a different partner)"
        if( writtenByYourself){
        	return true;
        }
        // "You may also use material from external sources, so long as: (1) the material is available to all students in the class;"
        if (!availableToOthers) {
            return false;
        }
        //"You may not use materials produced as course work by other students, whether in this term or previous terms, nor may you provide work for other students to use."
        if (writtenAsCourseWork) {
            return false;
        }
        //"It’s fine to use material from external sources like StackOverflow, but only with proper attribution"
        if (!citingYourSource) {
            return false;
        }
        //"In particular, if the assignment says “implement X ,” then you must create your own X , not reuse one from an external source."
        if (implementationRequired) {
            return false;
        }
        if (implementationRequired) {
            return false;
        }
        // if all conditions satisfied then we return true
        return false;
    }
    
    /**
     * Main method of the class.
     * 
     * Runs the mayUseCodeInAssignment method.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("You may certainly use code you wrote yourself: " +
            RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
}
