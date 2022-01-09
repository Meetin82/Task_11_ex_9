import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.semenov_d_s.FindingLengthOfEachWord;

public class TestingOfFindingLengthOfEachWord {
    FindingLengthOfEachWord findingLengthOfEachWord = new FindingLengthOfEachWord();

    @Test
    public void testFindingLengthOfEachWordWithOneWord() {
        String testedText = "ФКН";
        String expectedResult = "ФКН(3)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindingLengthOfEachWordWithNumbers() {
        String testedText = "1 121 12321 12";
        String expectedResult = "1(1) 121(3) 12321(5) 12(2)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindingLengthOfEachWordWithEnglishText() {
        String testedText = "My password is Agh@3tjh89@223";
        String expectedResult = "My(2) password(8) is(2) Agh(3) 3tjh89(6) 223(3)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindingLengthOfEachWordWithOneNumber() {
        String testedText = "0";
        String expectedResult = "0(1)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindingLengthOfEachWordWithSomeSimpleWords() {
        String testedText = "Я родился в городе Нововоронеж";
        String expectedResult = "Я(1) родился(7) в(1) городе(6) Нововоронеж(11)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
