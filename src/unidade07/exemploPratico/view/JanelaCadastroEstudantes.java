package unidade07.exemploPratico.view;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import unidade07.exemploPratico.model.Estudante;
import unidade07.exemploPratico.model.RepositorioEstudantes;

public class JanelaCadastroEstudantes extends JFrame{
    private RepositorioEstudantes repositorio;
	private PainelFormularioEstudante painelFormulario;
	private PainelTabelaEstudantes painelTabela;

	public JanelaCadastroEstudantes() {
		// Configuração da janela
		setTitle("Cadastro de Estudantes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);

		// Inicializa o repositório de estudantes
		repositorio = new RepositorioEstudantes();

		// Configura o layout
		setLayout(new BorderLayout(10, 10));

		// Cria os painéis
		painelFormulario = new PainelFormularioEstudante();
		painelTabela = new PainelTabelaEstudantes();

		// Adiciona os painéis à janela
		add(painelFormulario, BorderLayout.NORTH);
		add(painelTabela, BorderLayout.CENTER);

		// Configura a ação do botão de cadastro
		painelFormulario.definirAcaoBotaoCadastrar(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Estudante estudante = painelFormulario.obterEstudanteDoFormulario();
				if (estudante != null) {
					repositorio.adicionarEstudante(estudante);
					painelTabela.atualizarTabela(repositorio.obterTodosEstudantes());
					painelFormulario.limparFormulario();
				}
			}
		});

		// Configura a ação do botão de remoção
		painelTabela.definirAcaoBotaoRemover(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int linhaSelecionada = painelTabela.obterLinhaSelecionada();
				if (linhaSelecionada >= 0) {
					repositorio.removerEstudante(linhaSelecionada);
					painelTabela.atualizarTabela(repositorio.obterTodosEstudantes());
				}
			}
		});
	}
}
