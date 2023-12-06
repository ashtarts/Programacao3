import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Conta> listaContas = new ArrayList<>();

    public Main() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Sistema Bancário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("SISTEMA BANCÁRIO");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 32));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        topPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2, 10, 10));

        JButton criarContaButton = estilo("Criar Conta", new Color(156, 39, 176));
        JButton realizarOperacoesButton = estilo("Realizar Operações", new Color(156, 39, 176));
        JButton exibirSaldoButton = estilo("Exibir Saldo", new Color(156, 39, 176));
        JButton sairButton = estilo("Sair", new Color(156, 39, 176));

        buttonPanel.add(criarContaButton);
        buttonPanel.add(realizarOperacoesButton);
        buttonPanel.add(exibirSaldoButton);
        buttonPanel.add(sairButton);

        topPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(topPanel, BorderLayout.CENTER);

        criarContaButton.addActionListener(e -> criar());
        realizarOperacoesButton.addActionListener(e -> realizarOperacoes());
        exibirSaldoButton.addActionListener(e -> exibirSaldo());
        sairButton.addActionListener(e -> System.exit(0));

        criarContaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                criarContaButton.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                criarContaButton.setForeground(Color.BLACK);
            }
        });

        realizarOperacoesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                realizarOperacoesButton.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                realizarOperacoesButton.setForeground(Color.BLACK);
            }
        });

        exibirSaldoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exibirSaldoButton.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                exibirSaldoButton.setForeground(Color.BLACK);
            }
        });

        sairButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairButton.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                sairButton.setForeground(Color.BLACK);
            }
        });

        frame.setVisible(true);
    }

    private JButton estilo(String text, Color backgroundColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setBackground(backgroundColor);
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(200, 50));
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return button;
    }

    private void addRow(JPanel panel, String labelText, JComponent component) {
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setForeground(new Color(50, 50, 50)); // Cor do texto
        panel.add(label);

        component.setFont(new Font("Arial", Font.PLAIN, 14));
        component.setBackground(new Color(255, 255, 255));
        component.setForeground(new Color(50, 50, 50));
        panel.add(component);
    }

    public void criar() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));
        panel.setBackground(new Color(230, 230, 230));

        JTextField nomeField = new JTextField();
        JTextField enderecoField = new JTextField();
        JTextField profissaoField = new JTextField();
        JTextField tipoContaField = new JTextField();
        JTextField agenciaField = new JTextField();
        JTextField contaField = new JTextField();
        JTextField saldoField = new JTextField();

        addRow(panel, "Nome do cliente:", nomeField);
        addRow(panel, "Endereço do cliente:", enderecoField);
        addRow(panel, "Profissão do cliente:", profissaoField);
        addRow(panel, "Tipo de conta (poupança ou corrente):", tipoContaField);
        addRow(panel, "Número da agência:", agenciaField);
        addRow(panel, "Número da conta:", contaField);
        addRow(panel, "Saldo inicial:", saldoField);

        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Criar Conta",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            String nome = nomeField.getText();
            String endereco = enderecoField.getText();
            String profissao = profissaoField.getText();
            String tipo = tipoContaField.getText();
            try {
                int agencia = Integer.parseInt(agenciaField.getText());
                int conta = Integer.parseInt(contaField.getText());
                double saldo = Double.parseDouble(saldoField.getText());

                Cliente cliente = new Cliente(nome, endereco, profissao);
                listaClientes.add(cliente);

                Conta contaObj;
                if (tipo != null && (tipo.equalsIgnoreCase("poupança") || tipo.equalsIgnoreCase("corrente"))) {
                    contaObj = tipo.equalsIgnoreCase("poupança") ? new ContaPP() : new ContaC();
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo de conta inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                    do {
                        tipo = JOptionPane.showInputDialog("Digite Poupança ou Corrente para escolher o tipo da conta: ");
                    } while (!tipo.equalsIgnoreCase("poupança") && !tipo.equalsIgnoreCase("corrente"));
                    contaObj = tipo.equalsIgnoreCase("poupança") ? new ContaPP() : new ContaC();
                }

                if (saldo < 0) {
                    do {
                        saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor maior ou igual que 0: "));
                    } while (saldo < 0);
                }

                contaObj.setAgencia(agencia);
                contaObj.setConta(conta);
                contaObj.setSaldo(saldo);
                contaObj.setCliente(cliente);
                listaContas.add(contaObj);

                JOptionPane.showMessageDialog(null, "Conta foi criada", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Erro: Número da conta invalido ou número da agencia");
            }
        }
    }

    public void realizarOperacoes() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));
        panel.setBackground(new Color(230, 230, 230)); // Cor de fundo

        JTextField agenciaEnvioField = new JTextField();
        JTextField contaEnvioField = new JTextField();
        JTextField agenciaRecebimentoField = new JTextField();
        JTextField contaRecebimentoField = new JTextField();
        JTextField valorTransferenciaField = new JTextField();

        addRow(panel, "Número da agência da conta de envio:", agenciaEnvioField);
        addRow(panel, "Número da conta de envio:", contaEnvioField);
        addRow(panel, "Número da agência da conta de recebimento:", agenciaRecebimentoField);
        addRow(panel, "Número da conta de recebimento:", contaRecebimentoField);
        addRow(panel, "Valor a ser transferido:", valorTransferenciaField);

        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Realizar Operações",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            int agenciaEnvio = Integer.parseInt(agenciaEnvioField.getText());
            int contaEnvio = Integer.parseInt(contaEnvioField.getText());
            int agenciaRecebimento = Integer.parseInt(agenciaRecebimentoField.getText());
            int contaRecebimento = Integer.parseInt(contaRecebimentoField.getText());
            double valorTransferencia = Double.parseDouble(valorTransferenciaField.getText());
            if(valorTransferencia <= 0){
                do{
                    valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor maior que 0: "));
                }while(valorTransferencia <= 0);
            }
            op(agenciaEnvio, contaEnvio, agenciaRecebimento, contaRecebimento, valorTransferencia);
        }
    }

    public void exibirSaldo() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));
        panel.setBackground(new Color(230, 230, 230)); // Cor de fundo

        JTextField agenciaContaField = new JTextField();
        JTextField contaField = new JTextField();
        JTextField mesesField = new JTextField();

        addRow(panel, "Número da agência da conta:", agenciaContaField);
        addRow(panel, "Número da conta:", contaField);
        addRow(panel, "Quantidade de meses para simular o saldo:", mesesField);

        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Exibir Saldo",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            int agenciaConta = Integer.parseInt(agenciaContaField.getText());
            int conta = Integer.parseInt(contaField.getText());
            int meses = Integer.parseInt(mesesField.getText());

            show(agenciaConta, conta, meses);
        }
    }

    public void op(int t, int u, int v, int m, double n) {
        Conta contaEnvio = null;
        Conta contaRecebe = null;
        for (Conta conta : listaContas) {
            if (conta.getAgencia() == t && conta.getConta() == u) {
                contaEnvio = conta;
            }
            if (conta.getAgencia() == v && conta.getConta() == m) {
                contaRecebe = conta;
            }
        }
        if (contaEnvio != null && contaRecebe != null) {
            if(contaEnvio.getSaldo() < n){
                JOptionPane.showMessageDialog(null,"Saldo insuficiente.");
            }else {
                contaEnvio.transferencia(contaRecebe, n);
                JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conta de envio ou recebimento não encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void show(int t, int u, int meses) {
        Conta consult = null;
        for (Conta conta : listaContas) {
            if (conta.getAgencia() == t && conta.getConta() == u) {
                consult = conta;
            }
        }
        if (consult != null) {
            double aux;
            if (consult instanceof ContaPP poupanca) {
                aux = poupanca.simularOperacao(meses);
                JOptionPane.showMessageDialog(null, "Saldo da conta poupança após " + meses + " meses: " + aux, "Exibir Saldo", JOptionPane.INFORMATION_MESSAGE);
            } else if (consult instanceof ContaC corrente) {
                aux = corrente.simularOperacao(meses);
                JOptionPane.showMessageDialog(null, "Saldo da conta corrente após " + meses + " meses: " + aux, "Exibir Saldo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conta não encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
