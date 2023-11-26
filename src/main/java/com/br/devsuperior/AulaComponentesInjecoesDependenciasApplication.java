package com.br.devsuperior;

import com.br.devsuperior.entities.Order;
import com.br.devsuperior.services.OrderService;
import com.br.devsuperior.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class AulaComponentesInjecoesDependenciasApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ShippingService shippingService;

    public static void main(String[] args) {
        SpringApplication.run(AulaComponentesInjecoesDependenciasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("-----------------------Dados do pedido-----------------------");

                System.out.println("codigo: ");
                Integer codigo = sc.nextInt();
                System.out.println("valor basico: ");
                Double valorBasico = sc.nextDouble();
                System.out.println("porcentagem do desconto: ");
                Double porcentagemDesconto = sc.nextDouble();

                Order order = new Order(codigo, valorBasico, porcentagemDesconto);
                System.out.println("-----------------------SAÍDA-----------------------");
                System.out.println("Pedido código: " + order.getCode());
                System.out.println("Valor total: R$ " + orderService.total(order));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

        System.exit(0);
    }
}
