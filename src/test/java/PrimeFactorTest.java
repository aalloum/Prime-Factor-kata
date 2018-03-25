import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.Assertions.*;
public class PrimeFactorTest {

    public List<Integer> list(int... ints){
        List<Integer> list =  new ArrayList<Integer>();
        for(int i : ints){
            list.add(i);
        }
        return list;
    }
    @Test
    public void test_one() {
        assertEquals(list(),PrimeFactor.generate(1));
    }

    @Test
    public void test_two() {
        assertEquals(list(2),PrimeFactor.generate(2));
    }

    @Test
    public void test_three() {
        assertEquals(list(3),PrimeFactor.generate(3));
    }

    @Test
    public void test_four() {
        assertEquals(list(2,2),PrimeFactor.generate(4));
    }

    @Test
    public void test_fifth() {
        assertEquals(list(2,3),PrimeFactor.generate(6));
    }

    @Test
    public void test_eight() {
        assertEquals(list(2,2,2),PrimeFactor.generate(8));
    }

    @Test
    public void test_nine() {
        assertEquals(list(3,3),PrimeFactor.generate(9));
    }
}
