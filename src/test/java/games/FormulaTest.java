package games;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import GoverningBodies.Formula;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormulaTest {
    private Formula formula;

    @BeforeEach
    void setup(){
        formula = new Formula("F1", 72, true,"Motorsport","FIA");
    }

    @Test
    void sportName(){
        assertEquals(72, formula.getAge());
    }

    @Test
    void teamSelection(){
        assertEquals(2, formula.teams());
    }
}
