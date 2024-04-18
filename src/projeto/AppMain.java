package projeto;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class AppMain {

	public static void main(String[] args) {

		//		Crição de Objetos Polimorficos

		Pessoa pessoa_dono1 = new Dono();
		Dono dono1 = (Dono) pessoa_dono1;

		dono1.setNome("Nielson");
		dono1.setCpf("123");
		dono1.setCodigo(13);
		dono1.setSaldo(100000);

		Pessoa pessoa_dono2 = new Dono();
		Dono dono2 = (Dono) pessoa_dono2;
		dono2.setNome("Alan");
		dono2.setCpf("456");
		dono2.setCodigo(22);
		dono2.setSaldo(100000);

		Pessoa pessoa_dono3 = new Dono();
		Dono dono3 = (Dono) pessoa_dono3;
		dono3.setNome("Leo");
		dono3.setCpf("789");
		dono3.setCodigo(24);
		dono3.setCodigo(100000);

		Pessoa pessoa_funcionario1 = new Funcionario();
		Funcionario funcionario_1 = (Funcionario) pessoa_funcionario1;
		funcionario_1.setNome("Lucas");
		funcionario_1.setCpf("23214235");
		funcionario_1.setCargo("Vendedor");
		funcionario_1.setSalario(1400);

		Pessoa pessoa_funcionario2 = new Funcionario();
		Funcionario funcionario_2 = (Funcionario) pessoa_funcionario2;
		funcionario_2.setNome("Flavio");
		funcionario_2.setCpf("2354643");
		funcionario_2.setCargo("Segurança");
		funcionario_2.setSalario(1400);

		Pessoa pessoa_funcionario3 = new Funcionario();
		Funcionario funcionario_3 = (Funcionario) pessoa_funcionario3;
		funcionario_3.setNome("Marcos Vinicius");
		funcionario_3.setCpf("54364776");
		funcionario_3.setCargo("Vendedor");
		funcionario_3.setSalario(600);

		Pessoa pessoa_funcionario4 = new Funcionario();
		Funcionario funcionario_4 = (Funcionario) pessoa_funcionario4;
		funcionario_4.setNome("Nadhon");
		funcionario_4.setCpf("375576476");
		funcionario_4.setCargo("Segurança");
		funcionario_4.setSalario(1600);

		Pessoa pessoa_funcionario5 = new Funcionario();
		Funcionario funcionario_5 = (Funcionario) pessoa_funcionario5;
		funcionario_5.setNome("GASA");
		funcionario_5.setCpf("463637356");
		funcionario_5.setCargo("Vendedor");
		funcionario_5.setSalario(1400);

		Pessoa pessoa_funcionario6 = new Funcionario();
		Funcionario funcionario_6 = (Funcionario) pessoa_funcionario6;
		funcionario_6.setNome("Ericlecio");
		funcionario_6.setCpf("634231124");
		funcionario_6.setCargo("Vendedor");
		funcionario_6.setSalario(1400);

		//		Loja 1 " Suplements "

		Loja suplements = new Loja();

		Produto anabolizante = new Produto();
		anabolizante.setNome("TremBolona");
		anabolizante.setPreco(40.00);

		Produto creatina = new Produto();
		creatina.setNome("creatina");
		creatina.setPreco(25.00);

		Produto whey = new Produto();
		whey.setNome("Whey-Proten");
		whey.setPreco(110.00);

		suplements.setNome("Suplements");
		suplements.setCnpj(4356);
		suplements.setDono(dono3);
		dono3.setLoja(suplements);

		suplements.getFuncionarios().add(funcionario_6);
		suplements.getFuncionarios().add(funcionario_5);

		suplements.getProdutos().add(whey);
		suplements.getProdutos().add(creatina);
		suplements.getProdutos().add(anabolizante);

		//		Loja 2 " Securyte " 

		Loja Securyte = new Loja();

		Securyte.setNome("Securyte");
		Securyte.setCnpj(7577);

		Produto SprayPimenta = new Produto();
		SprayPimenta.setNome("Spray de Pimenta");
		SprayPimenta.setPreco(10.00);

		Produto teaser = new Produto();
		teaser.setNome("Teaser 220V");
		teaser.setPreco(55.00);

		Produto cacetete = new Produto();
		cacetete.setNome("Cacetéte");
		cacetete.setPreco(200.00);

		Securyte.setDono(dono2);
		dono2.setLoja(Securyte);
		
		Securyte.getProdutos().add(cacetete);
		Securyte.getProdutos().add(teaser);
		Securyte.getProdutos().add(SprayPimenta);

		Securyte.getFuncionarios().add(funcionario_4);
		Securyte.getFuncionarios().add(funcionario_3);

		//		Loja 3 " Niel CELL "

		Loja nielCELL = new Loja();

		nielCELL.setNome("Niel CELL");
		nielCELL.setCnpj(5566);

		Produto Iphone11 = new Produto();
		Iphone11.setNome("Iphone 11");
		Iphone11.setPreco(2000.00);

		Produto Iphone12 = new Produto();
		Iphone12.setNome("Iphone 12");
		Iphone12.setPreco(2500.00);

		Produto Iphone13 = new Produto();
		Iphone13.setNome("Iphone 13");
		Iphone13.setPreco(3200.00);

		nielCELL.setDono(dono1);
		dono1.setLoja(nielCELL);

		nielCELL.getFuncionarios().add(funcionario_2);
		nielCELL.getFuncionarios().add(funcionario_1);

		nielCELL.getProdutos().add(Iphone13);
		nielCELL.getProdutos().add(Iphone12);
		nielCELL.getProdutos().add(Iphone11);

		Estacionamento estacionamento_yellow = new Estacionamento();
		estacionamento_yellow.setSetor("Amarelo");

		Estacionamento estacionamento_green = new Estacionamento();
		estacionamento_green.setSetor("Verde");

		Estacionamento estacionamento_funcionario = new Estacionamento();
		estacionamento_funcionario.setSetor("Setor Funcionario");

		Estacionamento carga = new Estacionamento();
		carga.setSetor("Carga e Descarga");


		Andar andar1= new Andar();
		andar1.setAndar(1);
		andar1.getLojas().add(suplements);

		Andar andar2= new Andar();
		andar2.setAndar(2);
		andar2.getLojas().add(Securyte);

		Andar andar3= new Andar();
		andar3.setAndar(3);
		andar3.getLojas().add(nielCELL);

		Fornecedor fornecedor_nielson = new Fornecedor();
		fornecedor_nielson.setCodigo(123);
		fornecedor_nielson.setNome("Apple");
		fornecedor_nielson.setCNPJ("141326475377");
		fornecedor_nielson.setLoja(nielCELL);

		fornecedor_nielson.getProdutos().add(Iphone13);
		fornecedor_nielson.getProdutos().add(Iphone12);
		fornecedor_nielson.getProdutos().add(Iphone11);
		

		Fornecedor fornecedor_alan = new Fornecedor();
		fornecedor_alan.setCodigo(321);
		fornecedor_alan.setNome("Policia Federal");
		fornecedor_alan.setCNPJ("12357548746");
		fornecedor_alan.setLoja(Securyte);

		fornecedor_alan.getProdutos().add(cacetete);
		fornecedor_alan.getProdutos().add(teaser);
		fornecedor_alan.getProdutos().add(SprayPimenta);

		Fornecedor fornecedor_Leo = new Fornecedor();
		fornecedor_Leo.setCNPJ("3643635767");
		fornecedor_Leo.setCodigo(132);
		fornecedor_Leo.setNome("GROWTH");
		fornecedor_Leo.setLoja(suplements);

		fornecedor_Leo.getProdutos().add(whey);
		fornecedor_Leo.getProdutos().add(creatina);
		fornecedor_Leo.getProdutos().add(anabolizante);

		Shopping shopping = new Shopping();
		shopping.setNome("A & N");
		shopping.setCNPJ(3554);

		shopping.getEstacionamento().add(estacionamento_yellow);
		shopping.getEstacionamento().add(estacionamento_yellow);
		shopping.getEstacionamento().add(estacionamento_funcionario);
		shopping.getEstacionamento().add(carga);

		shopping.getAndares().add(andar1);
		shopping.getAndares().add(andar2);
		shopping.getAndares().add(andar3);


		shopping.getFornecedores().add(fornecedor_Leo);
		shopping.getFornecedores().add(fornecedor_alan);
		shopping.getFornecedores().add(fornecedor_nielson);

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Pagamento pagamento = new Pagamento();

		Pessoa pessoa_cliente1 = new Cliente();
		Cliente cliente = (Cliente) pessoa_cliente1;

		boolean menu1= true;
		while (menu1 != false) {
			System.out.println("||-------Ola Seja Bem Vindo ao shopping A & N-------||\n\n"
					+ "Nós temos varias opções para você"
					+ ", Por favor nos diga oque você é: \n");
			System.out.println("1- Sou Cliente \n"
					+ "2- Sou Fornecedor \n"
					+ "3- Sou Funcionario do Shopping");
			System.out.print("\nDigite Aqui : ");

			int menu_principal = sc.nextInt();

			if (menu_principal == 1) {


				System.out.print("Por favor me diga seu nome: ");
				cliente.setNome(sc.next());
				System.out.print("Certo, agora me diga seu cpf: ");
				cliente.setCpf(sc.next());
				double conta = rd.nextInt(10000, 20000);
				cliente.setValorConta(conta);


				int opcaoEstacionar = -1;

				while(opcaoEstacionar != 0) {

					System.out.println("\n-------Ok , Seja Bem vindo! O valor do Estacionamento é unico"
							+ " e você pode escolher entre 2 setores :------- \n");
					System.out.println("1- Verde (Há serviços plus como lavagem..) PREÇO: R$ 45.00\n"
							+ "2- Amarelo (Apenas Estacionamento) PREÇO: R$ 25.00\n");
					System.out.print("Digite Aqui : ");
					int estacio = sc.nextInt();

					if (estacio == 1) {

						pagamento.PagamentoComun(cliente, 45);
						
						System.out.println("\nSeja bem vindo senhor "
								+ cliente.getNome()
								+ ", aproveite nossos produtos!\n");
						cliente.setEstacionamento(estacionamento_green);
						opcaoEstacionar = 0;
					} 

					else if (estacio == 2 )	{

						pagamento.PagamentoComun(cliente, 25);
						
						System.out.println("Seja bem vindo senhor "
								+ cliente.getNome()
								+ ", aproveite nossos produtos");
						cliente.setEstacionamento(estacionamento_yellow);
						opcaoEstacionar = 0;
					} 

					else {
						System.out.println("Opção invalida!");
					}

				}

				
				int opcaoLoja = -1;

				while(opcaoLoja != 0) {


					System.out.println("\n||--------SEJA BEM VINDO AO SHOPPING A & N!---------||");
					System.out.println("||-----Seu saldo é: R$ " + cliente.getValorConta());
					System.out.println("\nQual Loja você dejesa visitar ?: \n"
							+"\n1- " +shopping.getAndares().get(0).getLojas().get(0).getNome() + "\n"
							+"2- " +shopping.getAndares().get(1).getLojas().get(0).getNome() + "\n"
							+"3- " +shopping.getAndares().get(2).getLojas().get(0).getNome() + "\n"
							+"0- Sair do shopping");
					System.out.print("\nDigite Aqui: ");
					int andares_menu = sc.nextInt();

					Carrinho carrinho= new Carrinho();
					List<Double> total_list = new ArrayList<>();
					
					
					
					
					if (andares_menu == 1) {


						boolean menu = true;

						while (menu) {

							System.out.println("\n||---------Seja bem vindo a Loja Suplements!--------\n"
									+ "||--Aproveite Nossos produtos: \n");

							for (int i = 0; i < suplements.getProdutos().size(); i++) {

								System.out.println( (i+1) +"- " + suplements.getProdutos().get(i).getNome()
										+ " R$ : " + suplements.getProdutos().get(i).getPreco());

							}	

							System.out.print("\nDigite Aqui o produto para ser adicionado ao carrinho: ");
							int car_prod = sc.nextInt();
							System.out.print("Informe a quantidade de produtos: ");
							int car_quant = sc.nextInt();

							Itens itens= new Itens();

							if (car_prod ==1) {

								itens.setProduto(whey);
								itens.setQuantidade(car_quant);

							} else if ( car_prod == 2 ) {

								itens.setProduto(creatina);
								itens.setQuantidade(car_quant);

							} else if (car_prod == 3) {

								itens.setProduto(anabolizante);
								itens.setQuantidade(car_quant);

							}

							carrinho.getItens().add(itens);
							total_list.add(itens.getProduto().getPreco()*itens.getQuantidade());

							System.out.print("\nDesejar adicionar mais algum produto ?: \n"
									+ "1 - Sim\n"
									+ "2 - Não");
							System.out.print("\nDigite Aqui : ");
							int menu_2 = sc.nextInt();

							if (menu_2 == 2 ) {

								menu = false;

							}
						}



					} else if (andares_menu == 2) {

						boolean menu = true;

						while (menu) {

							System.out.println("\n||----------Seja bem vindo a Loja Securyte!----------\n"
									+  "||--Aproveite Nossos produtos: \n");

							for (int i = 0; i < Securyte.getProdutos().size(); i++) {

								System.out.println( (i+1) + "- " + Securyte.getProdutos().get(i).getNome()
												   + " R$ : " + Securyte.getProdutos().get(i).getPreco());

							}	

							System.out.print("\nDigite Aqui o produto para ser adicionado ao carrinho: ");
							int car_prod = sc.nextInt();
							System.out.print("Agora diga a quantidade desses produtod: ");
							int car_quant = sc.nextInt();

							Itens itens= new Itens();

							if (car_prod ==1) {

								itens.setProduto(cacetete);
								itens.setQuantidade(car_quant);

							} else if ( car_prod == 2 ) {

								itens.setProduto(teaser);
								itens.setQuantidade(car_quant);

							} else if ( car_prod == 3 ){

								itens.setProduto(SprayPimenta);
								itens.setQuantidade(car_quant);

							}

							carrinho.getItens().add(itens);
							total_list.add(itens.getProduto().getPreco()*itens.getQuantidade());

							System.out.print("\nDesejar adicionar mais algum produto dessa loja?: \n"
									+ "1 - Sim\n"
									+ "2 - Não");
							System.out.print("\nDigite Aqui : ");
							int menu_2 = sc.nextInt();

							if (menu_2 == 2 ) {

								menu = false;

							}

						}

						
						
						
					} else if (andares_menu == 3){

						boolean menu = true;

						while (menu) {

							System.out.println("\n||-------Seja bem vindo a Loja NiellCell!--------\n"
									+  "||--Aproveite Nossos produtos: \n");


							for (int i = 0; i < nielCELL.getProdutos().size(); i++) {

								System.out.println( (i+1) + "- " + nielCELL.getProdutos().get(i).getNome()
												  + " R$ : " + nielCELL.getProdutos().get(i).getPreco());

							}

							System.out.print("\nDigite Aqui o produto para ser adicionado ao carrinho: ");
							int car_prod = sc.nextInt();
							System.out.print("Agora diga a quantidade desses produtod: ");
							int car_quant = sc.nextInt();

							Itens itens= new Itens();

							if (car_prod ==1) {

								itens.setProduto(Iphone13);
								itens.setQuantidade(car_quant);

							} else if ( car_prod == 2 ) {

								itens.setProduto(Iphone12);
								itens.setQuantidade(car_quant);

							} else if ( car_prod == 3 ){

								itens.setProduto(Iphone11);
								itens.setQuantidade(car_quant);

							}

							carrinho.getItens().add(itens);
							total_list.add(itens.getProduto().getPreco()*itens.getQuantidade());
							

							System.out.print("\nDesejar adicionar mais algum produto ?: \n"
									+ "1 - Sim\n"
									+ "2 - Não");
							System.out.print("\nDigite Aqui : ");
							int menu_2 = sc.nextInt();

							if (menu_2 == 2 ) {

								menu = false;

							}

						}


					} if (andares_menu==1 || andares_menu==2 || andares_menu == 3 || andares_menu==0) {

						cliente.setCarrinho(carrinho);

					}

					
					
					if (andares_menu==0) {

						System.out.println("\nSenhor(a): " + cliente.getNome() + ", Obrigado por vir ao nosso shopping");

						System.out.println("-------Aqui esta seu bilhete: -------");
						System.out.println("Nome: " + cliente.getNome() + "\n"
								+"CPF:  " + cliente.getCpf() + "\n"
								+"Estacionamento: setor " + cliente.getEstacionamento().getSetor() + "\n"
								+"Foram Gastos no Shopping: " + (conta - cliente.getValorConta()) + "\n");

						break;
					}

					if (andares_menu >= 1 && andares_menu<= 3) { 
						
						System.out.println("\nAqui estão seus produtos: ");
						System.out.println("\nTOTAL DOS PRODUTOS: ");
						double total = 0;
						
						for (Double total_ : total_list) {

							total += total_;

						}

						System.out.println("R$ " + total);

						System.out.println("\nDeseja Realizar o pagamento ? \n"
								+ "1- Sim\n"
								+ "2- Não");
						System.out.print("Digite Aqui: ");
						int menu_ = sc.nextInt();

						if ( menu_ == 1) {

							if ( cliente.getValorConta() < total ) {

								System.out.println("Você não possui saldo suficiente!");

							} else {

								pagamento.PagamentoComun(cliente, total);
								System.out.println("Obrigado pela Compra! Volte Sempre");

							}

						}
						
					} else {
						
						System.out.println("Opção invalida!");
					}
					
					
					

				} 

				menu1 = false;

				
				
				
			} else if (menu_principal == 2) {

				boolean opcao = true;
				while (opcao) {

					System.out.print("Por favor, digite seu codigo de Fornecedor: ");
					int codigo = sc.nextInt();

					for (Fornecedor forn : shopping.getFornecedores()) {
						if (forn.getCodigo()== codigo) {
							System.out.println("\n||-------Seja bem vindo " + forn.getNome() + "!------||\n"
									+ "||----- Por favor se diriga ao setor descargada da loja" +forn.getLoja().getNome());
							forn.setEstacionamento(carga);
							
							if (forn.getLoja().getPedido() != null) {
								
								System.out.println("\nPedido Encontrado com sucesso: ");
								System.out.println("Produto: " + forn.getLoja().getPedido().getProduto().getNome());
								System.out.println("Quantidade: " + forn.getLoja().getPedido().getQuantidade());
								
								double unitario = forn.getLoja().getPedido().getProduto().getPreco() - ( (forn.getLoja().getPedido().getProduto().getPreco() * 0.10) );
								
								System.out.println("Preço Unitario : " + unitario);
								
								double total = unitario *  forn.getLoja().getPedido().getQuantidade();
								
								System.out.println("Quantia a se receber:  " + total + "\n");
								
								System.out.println("Deseja fornecer os produtos ? \n"
												  + "1- Sim\n"
												  + "2- Não");
								System.out.print("\nDigite Aqui: ");
								int reposta = sc.nextInt();
								
								if (reposta == 1) {
									
									forn.getLoja().getDono().setSaldo( forn.getLoja().getDono().getSaldo() - total );
									forn.setValorConta(total);
									forn.getLoja().setPedido(null);
									
									System.out.println("\nSeu valor ja foi creditado na conta! , agradecemos seus serviços\n");
									opcao = false;
									
									
									
								} else if (reposta == 2) {
									
									System.out.println("Certo, te aguardamos para uma proxima!\n");
									opcao= false;
									
									
								}
								
								
								
							} else {
								
								System.out.println("\nNão há pedidos para você!\n");
								opcao= false;
								
								
							}
							
							
							opcao = false;

							

							break;


						} 

					}

				}


			} else if (menu_principal == 3) {

				
				System.out.print("Por favor, Digite seu cpf :");
				String cpf = sc.next(); 


				for (Andar and : shopping.getAndares()) {

					for (Loja loja : and.getLojas()) {

						if (loja.getDono().getCpf() == cpf.intern()) {
							System.out.println("\nSeja Bem vindo Senhor " 
									+ loja.getDono().getNome() 
									+ ", A loja "
									+ loja.getNome()
									+ " o espera!");
							
							System.out.println("A loja necesita de produtos! ");
							Itens pedido = loja.getDono().pedidoProd();
							loja.setPedido(pedido);
							System.out.println("\nPedido Realizado com sucessso! \n");
							
							
						}

						for (Funcionario func: loja.getFuncionarios()) {


							if (func.getCpf() == cpf.intern()) {
								System.out.println("Passagem Liberada senhor " 
										+ func.getNome() 
										+ ", bem vindo ao trabalho!");
							} 


						}

					}

				}

			} else {
				System.out.println("Opção invalida");
				
			}


		}


	}

	
}