package games;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import GoverningBodies.Premier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PremierTest {
    private Premier premier;

    @BeforeEach
    void setup(){
        premier = new Premier("football", 30, true);
    }

    @Test
    void footballSelection(){
        assertEquals(1, premier.getPrem());
    }
}
