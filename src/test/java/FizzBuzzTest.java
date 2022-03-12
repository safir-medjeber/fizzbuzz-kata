import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {

   FizzBuzz fizzBuzz = new FizzBuzz();


   @Test
   public void given_one_should_return_one() {
      int input = 1;

      String actual = fizzBuzz.fizzBuzz(input);

      assertEquals("1",actual);
   }


   @Test
   public void given_two_should_return_two() {
      int input = 2;

      String actual = fizzBuzz.fizzBuzz(input);

      assertEquals("2",actual);
   }


   @Test
   public void given_three_should_return_fizz() {
      int input = 3;

      String actual = fizzBuzz.fizzBuzz(input);

      assertEquals("Fizz", actual);
   }

   @Test
   public void given_six_should_return_Fizz() {
      int input = 6;

      String actual = fizzBuzz.fizzBuzz(input);

      assertEquals("Fizz", actual);
   }

   @Test
   public void given_five_should_return_Buzz() {
      int input = 5;

      String actual = fizzBuzz.fizzBuzz(input);

      assertEquals(actual, "Buzz");
   }


   @Test
   public void given_fifteen_should_return_FizzBuzz() {
      int input = 15;

      String actual = fizzBuzz.fizzBuzz(input);
      
      assertEquals(actual, "FizzBuzz");
   }


   @Test
   public void given_sequence_of_number_should_return_fizzbuzz_string() {
      List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

      String actual = fizzBuzz.compute(list);

      String expected = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
      assertEquals(actual, expected);
   }
}
