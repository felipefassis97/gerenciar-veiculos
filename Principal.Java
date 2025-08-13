public class Principal {
    public static void main(String[] args) {
        // Criando objetos
        Veiculo carro = new Carro("Toyota Corolla", 2022, 150.0);
        Veiculo moto = new Moto("Honda CB500", 2021, 100.0);

        // Testando métodos
        carro.acelerar();
        moto.acelerar();

        // Calculando preços
        System.out.println("Preço total do carro por 5 dias: R$ " + carro.calcularPrecoTotal(5));
        System.out.println("Preço total da moto por 3 dias: R$ " + moto.calcularPrecoTotal(3));
    }
}
