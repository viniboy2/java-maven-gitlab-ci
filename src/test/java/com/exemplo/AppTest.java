package com.exemplo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSomaSucesso() {
        App app = new App();
        assertEquals(5, app.soma(2, 3));
    }

    @Test
    public void testFalhaProposital() {
        App app = new App();
        // Este teste vai falhar propositalmente conforme solicitado
        assertEquals("Este teste deve falhar", 10, app.soma(2, 3));
    }
}
