/// BOTAO CALCULAR

double total = 0;

        //  Verifica item por item e soma os valores marcados
        if (chkBurguer.isSelected()) total += 10; // Se o X-Burguer estiver marcado, soma 10
        if (chkBatata.isSelected()) total += 6;  // Se a Batata estiver marcada, soma 6
        if (chkRefri.isSelected()) total += 5;   // Se o Refri estiver marcado, soma 5
        if (chkSuco.isSelected()) total += 7;    // Se o Suco estiver marcado, soma 7
        if (chkSobremesa.isSelected()) total += 8; // Se a Sobremesa estiver marcada, soma 8

        // Mostra o resultado formatado
        lblResultado.setText(String.format("🍽 Total: R$ %.2f", total));

        //  Troca a cor e mensagem conforme o valor
        if (total == 0) {
            lblResultado.setForeground(new java.awt.Color(200, 0, 0)); // vermelho
            lblResultado.setText("😕 Nenhum item selecionado!");
        }
        else if (total < 10) {
            lblResultado.setForeground(new java.awt.Color(0, 100, 0)); // verde escuro
        }
        else if (total <= 25) {
            lblResultado.setForeground(new java.awt.Color(0, 128, 255)); // azul
        }
        else {
            lblResultado.setForeground(new java.awt.Color(255, 128, 0)); // laranja
            lblResultado.setText(String.format("🤩 Pedido completo! Total: R$ %.2f", total));
        }   // TODO add your handling code here:
    }                                           

// BOTAO LIMPAR
// Desmarca todas as opções
        chkBurguer.setSelected(false);
        chkBatata.setSelected(false);
        chkRefri.setSelected(false);
        chkSuco.setSelected(false);
        chkSobremesa.setSelected(false);

        // Restaura o texto do resultado
        lblResultado.setText("Total: R$ 0,00");
        lblResultado.setForeground(new java.awt.Color(0, 0, 0)); // volta a cor preta   
