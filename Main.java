package lab;

// Alunos 
// Matheus Fernande 
// Caique Brambilla
// Arthur Nakaya

public class Main {
	
	public static void main(String[] args) {
		
		TadFila radio = new TadFila(8640);
		
		
		// Dias
		// s - 1
		// a - 2
		// b - 3
		// c - 4
		// d - 5
		// e - 6
		// f - 7
		// g - 8
		// h - 9
		// i - 10
		// j - 11
		// k - 12
		// l - 13
		// m - 14
		// n - 15
		// o - 16
		// p - 17
		// q - 18
		// r - 19
		// t - 20
		// u - 21
		// v - 22
		// w - 23
		// x - 24
		// y - 25
		// z - 26
		// as - 27
		// bs - 28
		// cs - 29
		// ds - 30
	
		//==============================================================
		//Artistas 
		
		Artista Matue = new Artista("Matue", "Ceara", "28");
		Artista Teto = new Artista("Teto", "Bahia", "20");
		Artista Wiu = new Artista("WIU", "Ceara", "19");
		Artista Dfideliz = new Artista("Dfideliz", "São Paulo", "23");
		Artista YunkVino = new Artista("Yunk Vino", "São Paulo", "25");
		Artista Derek = new Artista("Derek", "São Paulo", "22");
		Artista KayBlack = new Artista("kayBlack", "São Paulo", "21");
		Artista JeSant = new Artista("Jé Santiago", "São Paulo", "25");
		Artista YungBuda = new Artista("Yung Buda", "São Paulo", "24");
		Artista Travis = new Artista("Travis Scott", "Texas", "31");
		
		
		Artista DjEry = new Artista("Dj Ery", "São Paulo", "28");
		Artista GBR = new Artista("DJ GBR", "São Paulo", "20");
		Artista Livinho = new Artista("Mc Livinho", "São Paulo", "27");
		Artista McDonJuan = new Artista("Mc Don Juan", "São Paulo", "21");
		Artista SalvadorDaRima = new Artista("Salvador da Rima", "São Paulo", "19");
		Artista Sidoka = new Artista("Sidoka", "Belo Horizonte", "22");
		Artista L7nnon = new Artista("L7nnon", "Rio de Janeiro", "28");
		Artista PozeDoRodo = new Artista("Mc Poze do Rodo", "Rio de Janeiro", "23");
		Artista PostMalone = new Artista("Post Malone", "Nova York", "27");
		Artista JustinBieber = new Artista("Justin Bieber", "Canadá", "28");
		Artista Marshmello = new Artista("Marshmello", "Estados Unidos", "30");
		Artista Khalid = new Artista("Khalid", "Estados Unidos", "24");
		Artista BrunoMars = new Artista("Bruno Mars", "Estados Unidos", "36");
		Artista EdSheeran = new Artista("EdSheeran", "Reino Unido", "31");
		Artista Coldplay = new Artista("Coldplay", "Reino Unido", "26");
		Artista ImagineDragons = new Artista("Imagine Dragon", "Estados Unidos", "34");
		Artista SnoopDog = new Artista("Snoop Dogg", "Estados Unidos", "50");
		Artista FrankOcean = new Artista("Frank Ocean", "Estados Unidos", "34");
		Artista ArticMonkeys = new Artista("Artic Monkeys", "Inglaterra", "30");
		Artista Pericles = new Artista("Pérciles", "São Paulo", "53");
		Artista Anitta = new Artista("Anitta", "São Paulo", "29");
		Artista HarryStyle = new Artista("Harry Style", "Reino Unido", "28");
		Artista Zyan = new Artista("Zyan", "Reino Unido", "29");
		Artista ArianaGrande = new Artista("Ariana Grande", "Estados Unidos", "29");
		Artista SelenaGomez = new Artista("Selena Gomez", "Estados Unidos", "30");
		Artista Alok = new Artista("Alok", "Goiânia", "31");
		Artista Avicii = new Artista("Avicii", "Suécia", "29");
		Artista OneRepublic = new Artista("One Republic", "Estados Unidos", "20");
		Artista JorgeMatheus = new Artista("Jorge & Matheus", "Goiás", "17");
		Artista MatheusKaua = new Artista("Matheus & Kaua", "Goiás", "12");
		Artista HenriqueJuliano = new Artista("Henrique & Julaiano", "Tocantins", "14");
		Artista McKevin = new Artista("Mc Kevin", "São Paulo", "23");
		Artista McHariel = new Artista("Mc Hariel", "São Paulo", "24");
		
		
		Artista Mateca = new Artista("Mateca", "São Paulo", "23");
		Artista Japa = new Artista("Japa", "São Paulo", "24");
		
		
		//===============================================================
		//Musicas
		
		
		Musica Vampiro = new Musica("Vampiro", "2022", Matue );
				Slot s1 = new Slot(1,1, Vampiro);
		
		Musica SemDo = new Musica("Sem Do", "2021", Matue );
				Slot s2 = new Slot(1,2, SemDo);
		
		Musica Groupies = new Musica("Groupies", "2021", Matue );
				Slot s3 = new Slot(1,3, Groupies);
			
		Musica QuerVoar = new Musica("Quer Voar", "2021", Matue );
				Slot s4 = new Slot(1,4, QuerVoar);
	
		Musica M4 = new Musica("M4", "2021", Matue );
				Slot s5 = new Slot(1,5, M4);
		
		Musica Banco = new Musica("Banco", "2019", Matue);
				Slot s6 = new Slot(1, 6, Banco);
				
		Musica AMorteDoAutotune = new Musica("A Morte do Autotune", "2019", Matue);
				Slot s7 = new Slot(1, 7, AMorteDoAutotune);
				
		Musica QuemMandaEA30 = new Musica("Quem Manda é a 30", "2018", Matue);
				Slot s8 = new Slot(1, 8, QuemMandaEA30);
		
		Musica BalAzul = new Musica("Bala Azul", "2022", Teto);
				Slot s9 = new Slot(1, 9, BalAzul);
		
		Musica TavaBom = new Musica("Tava Bom", "2022", Mateca);
				Slot s10 = new Slot(1, 10, TavaBom);
		
		Musica UmaBala = new Musica("Uma Bala", "2018", Derek);
				Slot s11 = new Slot(1, 11, UmaBala);
		
		Musica KennyG = new Musica("Kenny G", "2019", Matue);
				Slot s12 = new Slot(1, 12, KennyG);
		
		Musica a777666 = new Musica("777-666", "2020", Matue);
				Slot s13 = new Slot(1, 13, a777666);
		
		Musica Antes = new Musica("Antes", "2020", Matue);
				Slot s14 = new Slot(1, 14, Antes);
		
		Musica ESal = new Musica("É Sal", "2020", Matue);
				Slot s15 = new Slot(1, 15, ESal);
		
		Musica MaquinaDoTempo = new Musica("Maquina Do Tempo", "2020", Matue);
				Slot s16 = new Slot(1, 16, MaquinaDoTempo);
		
		Musica Cogulandia = new Musica("Cogulândia", "2020", Matue);
				Slot s17 = new Slot(1, 17, Cogulandia);
		
		Musica Manha = new Musica("Manha", "2021", Teto);
				Slot s18 = new Slot(1, 18, Manha);
		
		Musica DiaAzul = new Musica("Dia Azul", "2021", Teto);
				Slot s19 = new Slot(1, 19, DiaAzul);
		
		Musica Fashion = new Musica("Fashion", "2021", Teto);
				Slot s20 = new Slot(1, 20, Fashion);
		
		Musica Agua = new Musica("Agua", "2019", Japa);
				Slot s21 = new Slot(1, 21, Agua);
		
		Musica OkBaby = new Musica("Ok Baby", "2020", Japa);
				Slot s22 = new Slot(1, 22, OkBaby);
		
		Musica Rn = new Musica("Rn", "2019", Japa);
				Slot s23 = new Slot(1, 23, Rn);
		
		Musica Dejavu = new Musica("Dejavu", "2021", Japa);
				Slot s24 = new Slot(1, 24, Dejavu);
		
		Musica Osaka = new Musica("Osaka", "2021", Japa);
				Slot s25 = new Slot(1, 25, Osaka);
		
		Musica Kyoto = new Musica("Kyoto", "2021", Japa);
				Slot s26 = new Slot(1, 26, Kyoto);
		
		Musica DieForYou = new Musica("Die For You", "2021", Japa);
				Slot s27 = new Slot(1, 27, DieForYou);
		
		Musica a2036 = new Musica("2036", "2021", Japa);
				Slot s28 = new Slot(1, 28, a2036);
		
		Musica High = new Musica("High", "2021", Japa);
				Slot s29 = new Slot(1, 29, High);
		
		Musica SpikeLee = new Musica("Spike Lee", "2021", Japa);
				Slot s30 = new Slot(1, 30, SpikeLee);
		
		Musica Yokono = new Musica("Yokono", "2021", Japa);
				Slot s31 = new Slot(1, 31, Yokono);
		
		Musica Salao = new Musica("Salão", "2021", Japa);
				Slot s32 = new Slot(1, 32, Salao);
		
		Musica QuemEQuem = new Musica("Quem É Quem?", "2021", Japa);
				Slot s33 = new Slot(1, 33, QuemEQuem);
		
		Musica Prada = new Musica("Prada", "2021", Japa);
				Slot s34 = new Slot(1, 34, Prada);
				
		Musica OCaveiraoChegou = new Musica("O caveirão chegou", "2021", DjEry );
				Slot s35 = new Slot(1,35, OCaveiraoChegou);
				
		Musica OMaestroDosFluxos = new Musica("Maestro dos FLuxos", "2021", DjEry );
				Slot s36 = new Slot(1,36, OMaestroDosFluxos);
				
		Musica HinoDosParedoes = new Musica("Hino dos Paredões", "2021", DjEry );
				Slot s37 = new Slot(1,37, HinoDosParedoes);
					
		Musica Liberdade = new Musica("Liberdade", "2020", GBR );
				Slot s38 = new Slot(1,38, Liberdade);
			
		Musica MegaRaveSemChao = new Musica("Mega Rave Sem Chão", "2020", GBR );
				Slot s39 = new Slot(1, 39, MegaRaveSemChao);
				
		Musica RaveDaSirene = new Musica("Rave Da Sirene", "2020", GBR);
				Slot s40 = new Slot(1,40, RaveDaSirene);

		Musica IrmaGostosa = new Musica("Irmã Gostosa", "2018", Livinho );
				Slot s41 = new Slot(1,41, IrmaGostosa);
				
		Musica FazerFalta = new Musica("Fazer Falta", "2017", Livinho );
				Slot s42 = new Slot(1,42, FazerFalta);
				
		Musica SenteAMarra = new Musica("Sente a Marra", "2017", Livinho );
				Slot s43 = new Slot(1,43, SenteAMarra);
					
		Musica CalendarioDoPapai = new Musica("Calendária do Papai", "2019", McDonJuan );
				Slot s44 = new Slot(1,44, CalendarioDoPapai);
			
		Musica ToGostandoTantoDeVoce = new Musica("To Gostando Tanto De Voce", "2018", McDonJuan );
				Slot s45 = new Slot(1,45, ToGostandoTantoDeVoce);
				
		Musica Reputation = new Musica("Reputation", "2022", PostMalone);
				Slot s46 = new Slot(1, 46, Reputation);
		
		Musica Felina = new Musica("Felina", "2022", Wiu );
				Slot s47 = new Slot(1,47, Felina);
					
		Musica Sertao = new Musica("Sertao", "2022", Wiu );
				Slot s48 = new Slot(1,48, Sertao);
			
		Musica AmigaTalarica = new Musica("Amiga talarica", "2022", Wiu );
				Slot s49 = new Slot(1, 49, AmigaTalarica);
				
		Musica Pitbull = new Musica("Pitbull", "2021", Wiu);
				Slot s50 = new Slot(1,50, Pitbull);
		
		Musica LagrimasDecrocodilo = new Musica("lagrimas de Crocodilo", "2021", Wiu );
				Slot s51 = new Slot(1,51, LagrimasDecrocodilo);
					
		Musica Obraz = new Musica("Obraz", "2020", Wiu );
				Slot s52 = new Slot(1,52, Obraz);
			
		Musica Mantem = new Musica("Mantem", "2019", Wiu );
				Slot s53 = new Slot(1, 53, Mantem);
				
		Musica Sucrilhos = new Musica("Sucrilhos", "2019", Wiu);
				Slot s54 = new Slot(1,54, Sucrilhos);
				
		Musica DinheiroMeSonda = new Musica("Dinheiro me sonda", "2022", Dfideliz );
				Slot s55 = new Slot(1,55, DinheiroMeSonda);
				
		Musica Forbes = new Musica("Forbes", "2022", Dfideliz);
				Slot s56 = new Slot(1, 56, Forbes);
		
		Musica ElaRebolaPraMimeSenta = new Musica("Ela Rebola pra Mim e Senta", "2022", Dfideliz );
				Slot s57 = new Slot(1,57, ElaRebolaPraMimeSenta);
					
		Musica Marquinha = new Musica("Marquinha", "2022", Dfideliz );
				Slot s58 = new Slot(1,58, Marquinha);
			
		Musica MeninoBom = new Musica("Menino Bom", "2022", Dfideliz );
				Slot s59 = new Slot(1, 59, MeninoBom);
		
		
		//================================================================
		
		
		radio.inserir(s1);
		radio.inserir(s2);
		radio.inserir(s3);
		radio.inserir(s4);
		radio.inserir(s5);
		
		
		//================================================================
		
		System.out.println(s1.dscrição());
		System.out.println(s2.dscrição());
		System.out.println(s3.dscrição());
		System.out.println(s4.dscrição());
		System.out.println(s5.dscrição());
		
		System.out.println("===================");
		
		
		
		radio.buscarDia(1);
	
		
		
	
		
	}
}
