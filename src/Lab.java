import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Lab {
    private static Map<String, Chave> chaves = new HashMap<>();
    private static final String ARQUIVO_TXT = "registro1.txt";

    public void main() 
    {
        
        // 1. CARREGAR DADOS DO ARQUIVO TXT
        carregarArquivo();
        if (chaves.isEmpty()) {
            chaves.put("F07", new Chave("Laboratório de Programação Java"));
            chaves.put("B03", new Chave("Sala de Aula Padrão"));
            chaves.put("G09", new Chave("Oficina de Laternagem e Pintura"));
            salvarArquivo(); 
        }

        int opcao = 6;
        
        // 2. LOOP DO-WHILE COM MENU NO JOPTIONPANE
        do { 
            String menu = "--- DICIONÁRIO DE AMBIENTES ---\n"
                        + "1. Cadastrar\n"
                        + "2. Listar\n"
                        + "3. Pesquisar\n"
                        + "4. Excluir\n"
                        + "5. Alterar\n"
                        + "6. Sair\n\n"
                        + "--- Sugestões de Chaves Padrão ---\n"
                        + "F07 -> Laboratório de Programação Java\n"
                        + "B03 -> Sala de Aula Padrão\n"
                        + "G09 -> Oficina de Laternagem e Pintura\n\n"
                        + "Digite uma opção:";

            String entrada = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);
            
            // Tratamento caso o usuário clique em "Cancelar" ou feche a janela do menu
            if (entrada == null) {
                opcao = 6;
                break;
            }

            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite apenas números!", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    pesquisar();
                    break;
                case 4:
                    excluir();
                    break;
                case 5:
                    alterar();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Programa encerrado!", "Sair", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Aviso", JOptionPane.WARNING_MESSAGE);
            }

        } while (opcao != 6);
    }

    // --- MÉTODOS DE AÇÃO ADAPTADOS PARA JOPTIONPANE ---

    // 1. CADASTRAR
    public static void cadastrar() {
        String codigo = JOptionPane.showInputDialog(null, "Digite o código da nova chave (Ex: F08):", "Cadastrar", JOptionPane.QUESTION_MESSAGE);
        if (codigo == null || codigo.trim().isEmpty()) return;

        if (chaves.containsKey(codigo.toUpperCase())) {
            JOptionPane.showMessageDialog(null, "Erro: Esta chave já existe!", "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);
        } else {
            String descricao = JOptionPane.showInputDialog(null, "Digite a descrição do ambiente:", "Cadastrar", JOptionPane.QUESTION_MESSAGE);
            if (descricao == null || descricao.trim().isEmpty()) return;

            chaves.put(codigo.toUpperCase(), new Chave(descricao));
            salvarArquivo(); 
            JOptionPane.showMessageDialog(null, "Ambiente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // 2. LISTAR
    public static void listar() {
        if (chaves.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum ambiente cadastrado.", "Listagem", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder listaFormatada = new StringBuilder("--- AMBIENTES CADASTRADOS ---\n");
        for (String codigo : chaves.keySet()) {
            Chave c = chaves.get(codigo);
            listaFormatada.append("Chave: ").append(codigo).append(" -> Descrição: \"").append(c.getDescricao()).append("\"\n");
        }

        JOptionPane.showMessageDialog(null, listaFormatada.toString(), "Lista de Ambientes", JOptionPane.INFORMATION_MESSAGE);
    }

    // 3. PESQUISAR
    public static void pesquisar() {
        String codigo = JOptionPane.showInputDialog(null, "Digite a Chave para pesquisar:", "Pesquisar", JOptionPane.QUESTION_MESSAGE);
        if (codigo == null || codigo.trim().isEmpty()) return;

        Chave c = chaves.get(codigo.toUpperCase());

        if (c != null) {
            String resultado = "Busca encontrada!\n\n" + codigo.toUpperCase() + " -> \"" + c.getDescricao() + "\"";
            JOptionPane.showMessageDialog(null, resultado, "Resultado da Pesquisa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Chave não encontrada.\nVerifique se digitou corretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // 4. EXCLUIR
    public static void excluir() {
        String codigo = JOptionPane.showInputDialog(null, "Digite a chave que deseja remover:", "Excluir", JOptionPane.QUESTION_MESSAGE);
        if (codigo == null || codigo.trim().isEmpty()) return;

        if (chaves.containsKey(codigo.toUpperCase())) {
            chaves.remove(codigo.toUpperCase());
            salvarArquivo(); 
            JOptionPane.showMessageDialog(null, "Ambiente removido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Chave não encontrada para exclusão.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // 5. ALTERAR
    public static void alterar() {
        String codigo = JOptionPane.showInputDialog(null, "Digite a chave que deseja alterar:", "Alterar", JOptionPane.QUESTION_MESSAGE);
        if (codigo == null || codigo.trim().isEmpty()) return;

        Chave c = chaves.get(codigo.toUpperCase());

        if (c != null) {
            String novaDescricao = JOptionPane.showInputDialog(null, "Descrição atual: " + c.getDescricao() + "\nDigite a nova descrição:", "Alterar", JOptionPane.QUESTION_MESSAGE);
            if (novaDescricao == null || novaDescricao.trim().isEmpty()) return;
            
            c.setDescricao(novaDescricao); 
            salvarArquivo(); 
            JOptionPane.showMessageDialog(null, "Descrição alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Chave não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // --- MÉTODOS DE PERSISTÊNCIA EM ARQUIVO .TXT ---

    private static void salvarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_TXT))) {
            for (Map.Entry<String, Chave> entry : chaves.entrySet()) {
                bw.write(entry.getKey() + ";" + entry.getValue().getDescricao());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }

    private static void carregarArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_TXT))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    chaves.put(partes[0].toUpperCase(), new Chave(partes[1]));
                }
            }
        } catch (IOException e) {
            // Arquivo ainda não existe, será criado no primeiro salvamento
        }
    }
}
