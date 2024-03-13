package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public  void emptyTest() {
        assertEquals(true, true);
    }


    //Brackets in correct order
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    //Brackets in incorrect order
    @Test
    public void incorrectOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


    //Empty string
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }


    //Single left bracket
    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }


    //Single right bracket
    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }


    //Nested brackets in correct order
    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }


    //Brackets in incorrect order
    @Test
    public void nestedBracketsWithIncorrectOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


    //Brackets with other characters
    @Test
    public void stringWithOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abc[def]ghi"));
    }


    //Unbalanced brackets
    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }


    //Unbalanced brackets with other characters
    @Test
    public void stringWithUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[abc[def]ghi"));
    }


    //Multiple pairs of brackets in correct order
    @Test
    public void multiplePairsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc][def]"));
    }


    //Multiple pairs of brackets in incorrect order
    @Test
    public void multiplePairsOfUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[abc][def]ghi["));
    }
}
