package Homeworks;

import java.util.Objects;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        new OptionalTest();
    }

    public void test(){

    }
    private void optional(){
        Optional.ofNullable(getLong())
                .map(this::mapLongToObject)
                .filter(c-> "1".equals(c))
                .orElse(null);
    }
    private Object mapLongToObject(Long id){
        TestOptional testOptional = new TestOptional();
        testOptional.name = String.valueOf(id);
        return id == 1 ? new Object():null;
    }
    private Long getLong(){
        return 1L;
    }
    public static class TestOptional{
        private String name;

    }
}
