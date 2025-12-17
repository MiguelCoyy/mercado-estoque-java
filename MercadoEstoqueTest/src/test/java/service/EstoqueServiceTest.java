package service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueServiceTest {

    @Test
    public void deveCalcularValorTotalDoEstoque() {
        int quantidade = 10;
        double precoUnitario = 5.0;

        double valorTotal = quantidade * precoUnitario;

        assertEquals(50.0, valorTotal);
    }
}
