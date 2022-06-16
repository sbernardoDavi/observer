import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionariaTest {

    @Test
    public void deveNotificarFuncionario() {
        Loja loja = new Loja("Nike", "Vassouras", "Centro", 100);
        Funcionaria funcionaria = new Funcionaria("Func 1");
        funcionaria.vender(loja);
        loja.efetuarVenda();
        assertEquals("Func 1, venda feita na Loja{Nome=Nike, Cidade=Vassouras, Endereco='Centro', Numero='100'}", funcionaria.getUltimaVenda());
    }

    @Test
    public void deveNotificarFuncionarios() {
        Loja loja = new Loja("Nike", "Vassouras", "Centro", 100);
        Funcionaria funcionaria1 = new Funcionaria("Func 1");
        Funcionaria funcionaria2 = new Funcionaria("Func 2");
        funcionaria1.vender(loja);
        funcionaria2.vender(loja);
        loja.efetuarVenda();
        assertEquals("Func 1, venda feita na Loja{Nome=Nike, Cidade=Vassouras, Endereco='Centro', Numero='100'}", funcionaria1.getUltimaVenda());
        assertEquals("Func 2, venda feita na Loja{Nome=Nike, Cidade=Vassouras, Endereco='Centro', Numero='100'}", funcionaria2.getUltimaVenda());
    }

    @Test
    public void naoDeveNotificarFunc() {
        Loja loja = new Loja("Nike", "Vassouras", "Centro", 100);
        Funcionaria funcionaria = new Funcionaria("Aluno 1");
        loja.efetuarVenda();
        assertEquals(null, funcionaria.getUltimaVenda());
    }

    @Test
    public void naoDeveNotificarFuncs() {
        Loja loja = new Loja("Nike", "Vassouras", "Centro", 100);
        Loja lojaB = new Loja("Adidas", "Barra", "Centro", 140);
        Funcionaria funcionaria1 = new Funcionaria("Func 1");
        Funcionaria funcionaria2 = new Funcionaria("Func 2");
        funcionaria1.vender(loja);
        funcionaria2.vender(lojaB);
        loja.efetuarVenda();
        assertEquals("Func 1, venda feita na Loja{Nome=Nike, Cidade=Vassouras, Endereco='Centro', Numero='100'}", funcionaria1.getUltimaVenda());
        assertEquals(null, funcionaria2.getUltimaVenda());
    }




}