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
		Artista JeSant = new Artista("Je Santiago", "São Paulo", "25");
		Artista YungBuda = new Artista("Yung Buda", "São Paulo", "24");
		Artista Travis = new Artista("Travis Scott", "Texas", "31");
		Artista McCaverinha = new Artista("Mc Caverinha", "São Paulo", "14");
		
		
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
		Artista Marshmellow = new Artista("Marshmellow", "Estados Unidos", "30");
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
		
		
		//==============================================================
		// Dia 1 
		
		
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
				
		Musica QuemMandaEA30 = new Musica("Quem Manda e a 30", "2018", Matue);
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
		
		Musica ESal = new Musica("E Sal", "2020", Matue);
				Slot s15 = new Slot(1, 15, ESal);
		
		Musica MaquinaDoTempo = new Musica("Maquina Do Tempo", "2020", Matue);
				Slot s16 = new Slot(1, 16, MaquinaDoTempo);
		
		Musica Cogulandia = new Musica("Cogulandia", "2020", Matue);
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
		
		Musica Salao = new Musica("Salao", "2021", Japa);
				Slot s32 = new Slot(1, 32, Salao);
		
		Musica QuemEQuem = new Musica("Quem E Quem?", "2021", Japa);
				Slot s33 = new Slot(1, 33, QuemEQuem);
		
		Musica Prada = new Musica("Prada", "2021", Japa);
				Slot s34 = new Slot(1, 34, Prada);
				
				
				
				
				
				
				
		Musica OCaveiraoChegou = new Musica("O caveirao chegou", "2021", DjEry );
				Slot s35 = new Slot(1,35, OCaveiraoChegou);
				
		Musica OMaestroDosFluxos = new Musica("Maestro dos FLuxos", "2021", DjEry );
				Slot s36 = new Slot(1,36, OMaestroDosFluxos);
				
		Musica HinoDosParedoes = new Musica("Hino dos Paredoes", "2021", DjEry );
				Slot s37 = new Slot(1,37, HinoDosParedoes);
					
		Musica Liberdade = new Musica("Liberdade", "2020", GBR );
				Slot s38 = new Slot(1,38, Liberdade);
			
		Musica MegaRaveSemChao = new Musica("Mega Rave Sem Chao", "2020", GBR );
				Slot s39 = new Slot(1, 39, MegaRaveSemChao);
				
		Musica RaveDaSirene = new Musica("Rave Da Sirene", "2020", GBR);
				Slot s40 = new Slot(1,40, RaveDaSirene);

		Musica IrmaGostosa = new Musica("Irma Gostosa", "2018", Livinho );
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
				
		Musica EuSoDeslizo = new Musica("Eu so Deslizo", "2021", Dfideliz);
				Slot s60 = new Slot(1,60, EuSoDeslizo);
		
		Musica DripdeNegao = new Musica("Drip de Negao", "2021", Dfideliz );
				Slot s61 = new Slot(1,61, DripdeNegao);
					
		Musica RockNRoll = new Musica("Rock N Roll", "2018", Dfideliz );
				Slot s62 = new Slot(1,62, RockNRoll);
			
		Musica PretoRico = new Musica("Preto Rico", "2018", Dfideliz );
				Slot s63 = new Slot(1, 63, PretoRico);
				
		Musica TranseiComAMorte = new Musica("Transei com a Morte", "2019", Dfideliz);
				Slot s64 = new Slot(1,64, TranseiComAMorte);
				
		Musica Cassino = new Musica("Cassino", "2019", Dfideliz );
				Slot s65 = new Slot(1,65, Cassino);
				
		Musica SuaSafada = new Musica("Sua Safada", "2019", Dfideliz);
				Slot s66 = new Slot(1, 66, SuaSafada);
		
		Musica Oracao = new Musica("Oracao", "2019", Dfideliz );
				Slot s67 = new Slot(1,67, Oracao);
					
		Musica Progresso = new Musica("Progresso", "2022", Dfideliz );
				Slot s68 = new Slot(1,68, Progresso);
			
		Musica DizQueEHoje = new Musica("Diz que e Hoje", "2021", Dfideliz );
				Slot s69 = new Slot(1, 69, DizQueEHoje);
				
				
				
				
				
				
				
				
				
				
				
				
				
		Musica MiamiVice = new Musica("Miami Vice", "2022", YunkVino);
				Slot s70 = new Slot(1,70, MiamiVice);
		
		Musica Wave = new Musica("Wave", "2022", YunkVino);
				Slot s71 = new Slot(1,71, Wave);
					
		Musica Vlife = new Musica("Vlife", "2022", YunkVino);
				Slot s72 = new Slot(1,72, Vlife);
			
		Musica Margiela = new Musica("margiela", "2021", YunkVino);
				Slot s73 = new Slot(1, 73, Margiela);
				
		Musica WaterWater = new Musica("Water Water", "2021", YunkVino);
				Slot s74 = new Slot(1,74, WaterWater);
				
		Musica OnlyFans = new Musica("Only Fans", "2021", YunkVino);
				Slot s75 = new Slot(1,75, OnlyFans);
				
		Musica Lilas = new Musica("Lilas", "2020", YunkVino);
				Slot s76 = new Slot(1, 76, Lilas);
		
		Musica Highlights = new Musica("Highlights", "2020", YunkVino);
				Slot s77 = new Slot(1,77, Highlights);
					
		Musica a30Dias = new Musica("30 Dias", "2020", YunkVino);
				Slot s78 = new Slot(1,78, a30Dias);
			
		Musica RSS = new Musica("R.S.S", "2020", YunkVino);
				Slot s79 = new Slot(1, 79, RSS);
				
				
				
				
				
				
				
				
		
		Musica LuisaSonza = new Musica("Luisa Sonza", "2022", Derek);
				Slot s80 = new Slot(1,80, LuisaSonza);
		
		Musica BlackMoney = new Musica("Black Money", "2022", Derek);
				Slot s81 = new Slot(1,81, BlackMoney);
					
		Musica ScoobyDoo = new Musica("Scooby Doo", "2022", Derek);
				Slot s82 = new Slot(1,82, ScoobyDoo);
			
		Musica a360 = new Musica("360", "2021", Derek);
				Slot s83 = new Slot(1, 83, a360);
				
		Musica ITOLDYOU = new Musica("I TOLD YOU", "2021", Derek);
				Slot s84 = new Slot(1,84, ITOLDYOU);
				
		Musica ForReal = new Musica("For Real", "2020", Derek);
				Slot s85 = new Slot(1,85, ForReal);
				
		Musica NoCap = new Musica("No Cap", "2020", Derek);
				Slot s86 = new Slot(1, 86, NoCap);
		
		Musica FeFeFe = new Musica("FeFeFe", "2020", Derek);
				Slot s87 = new Slot(1,87, FeFeFe);
					
		Musica EuTenhoDrip = new Musica("Eu Tenho Drip", "2019", Derek);
				Slot s88 = new Slot(1,88, EuTenhoDrip);
			
		Musica KylieJenner = new Musica("Kylie Jenner", "2019", Derek);
				Slot s89 = new Slot(1, 89, KylieJenner);
				
				
				
				
				
				
				
				
		
		Musica VestidoDaFendi = new Musica("Vestido da Fendi", "2022", KayBlack);
				Slot s90 = new Slot(1,90, VestidoDaFendi);
		
		Musica Licor43 = new Musica("Licor 43", "2022", KayBlack);
				Slot s91 = new Slot(1,91, Licor43);
					
		Musica Lembrancas = new Musica("Lembrancas", "2022", KayBlack);
				Slot s92 = new Slot(1,92, Lembrancas);
			
		Musica Tralha = new Musica("Tralha", "2022", KayBlack);
				Slot s93 = new Slot(1, 93, Tralha);
				
		Musica FogueteDaNasa = new Musica("Foguete da Nasa", "2021", KayBlack);
				Slot s94 = new Slot(1,94, FogueteDaNasa);
				
		Musica Freestyle = new Musica("Freestyle", "2022", KayBlack);
				Slot s95 = new Slot(1,95, Freestyle);
				
				
				
				
				
				
				
				
				
				
		Musica OPretoMaiscaro = new Musica("O Preto Mais Caro", "2022", McCaverinha);
				Slot s96 = new Slot(1, 96, OPretoMaiscaro);
		
		Musica DoubleCup = new Musica("Double Cup", "2022", McCaverinha);
				Slot s97 = new Slot(1,97, DoubleCup);
					
		Musica Evoque = new Musica("Evoque", "2021", McCaverinha);
				Slot s98 = new Slot(1,98, Evoque);
			
		Musica a212Vip = new Musica("212 Vip", "2021", McCaverinha);
				Slot s99 = new Slot(1, 99, a212Vip);
		
		Musica Flash = new Musica("Flash", "2019", McCaverinha);
				Slot s100 = new Slot(1, 100, Flash);
		
		Musica Medina = new Musica("Medina", "2019", McCaverinha);
				Slot s101 = new Slot(1,101, Medina);
		
		Musica TipoGTA = new Musica("Tipo GTA", "2019", McCaverinha);
				Slot s102 = new Slot(1,102, TipoGTA);
		
		Musica NaoPisaNoMeuBoot = new Musica("Nao Pisa no Meu Boot", "2019", McCaverinha);
				Slot s103 = new Slot(1,103, NaoPisaNoMeuBoot);
			
		Musica OPaiTaOn = new Musica("o Pai Ta On", "2021", McCaverinha);
				Slot s104 = new Slot(1,104, OPaiTaOn);
	
		Musica SeSegura = new Musica("Se Segura", "2022", McCaverinha);
				Slot s105 = new Slot(1,105, SeSegura);
				
				
				
				
				
				
				
		
		Musica POCPOC = new Musica("POC POC", "2020", JeSant);
				Slot s106 = new Slot(1, 106, POCPOC);
				
		Musica JackBauer = new Musica("Jack Bauer", "2021", JeSant);
				Slot s107 = new Slot(1, 107, JackBauer);
				
		Musica Honda = new Musica("Honda", "2020", JeSant);
				Slot s108 = new Slot(1, 108, Honda);
		
		Musica TT = new Musica("TT", "2020", JeSant);
				Slot s109 = new Slot(1, 109, TT);
		
		Musica Rush = new Musica("Rush", "2020", JeSant);
				Slot s110 = new Slot(1, 110, Rush);
				
		Musica Balenciaga = new Musica("Balenciaga", "2020", JeSant);
				Slot s111 = new Slot(1, 111, Balenciaga);
		
		Musica LV = new Musica("LV", "2020", JeSant);
				Slot s112 = new Slot(1, 112, LV);
		
		Musica Snakes = new Musica("Snakes", "2020", JeSant);
				Slot s113 = new Slot(1, 113, Snakes);
		
		Musica Mob = new Musica("Mob", "2019", JeSant);
				Slot s114 = new Slot(1, 114, Mob);
		
		Musica NovoRico = new Musica("Novo Rico", "2019", JeSant);
				Slot s115 = new Slot(1, 115, NovoRico);
		
		Musica Netflix = new Musica("Netflix", "2017", JeSant);
				Slot s116 = new Slot(1, 116, Netflix);
		
		Musica Dinero = new Musica("Dinero", "2020", JeSant);
				Slot s117 = new Slot(1, 117, Dinero);
		
		Musica VidaDeChafe = new Musica("Vida De Chefe", "2020", JeSant);
				Slot s118 = new Slot(1, 118, VidaDeChafe);
		
		Musica TipoGiroflex = new Musica("Tipo Giroflex", "2020", JeSant);
				Slot s119 = new Slot(1, 119, TipoGiroflex);
		
		Musica PlayboyInternacional = new Musica("Playboy Internacional", "2020", JeSant);
				Slot s120 = new Slot(1, 120, PlayboyInternacional);
				
				
				
				
		
		
				
				
		
		Musica Vilao = new Musica("Vilao", "2022", YungBuda);
				Slot s121 = new Slot(1, 121, Vilao);
		
		Musica Monstro = new Musica("Monstro", "2021", YungBuda);
				Slot s122 = new Slot(1, 122, Monstro);
		
		Musica HayabusaChromo = new Musica("Hayabusa Chromo", "2021", YungBuda);
				Slot s123 = new Slot(1, 123, HayabusaChromo);
		
		Musica DriftDeYasuo = new Musica("Drift de Yasuo", "2021", YungBuda);
				Slot s124 = new Slot(1, 124, DriftDeYasuo);
		
		Musica KatanaEPistola = new Musica("Katana E Pistola", "2021", YungBuda);
				Slot s125 = new Slot(1, 125, KatanaEPistola);
		
		Musica RidersX = new Musica("Riders X", "2021", YungBuda);
				Slot s126 = new Slot(1, 126, RidersX);
		
		Musica a7K = new Musica("7K", "2019", YungBuda);
				Slot s127 = new Slot(1, 127, a7K);
		
		Musica NewWave = new Musica("New Wave", "2019", YungBuda);
				Slot s128 = new Slot(1, 128, NewWave);
		
		Musica OSegredoAlemDoJardim = new Musica("O Sergredo Alem do Jardim", "2019", YungBuda);
				Slot s129 = new Slot(1, 129, OSegredoAlemDoJardim);
		
		Musica Ninja = new Musica("Ninja", "2019", YungBuda);
				Slot s130 = new Slot(1, 130, Ninja);
		
		Musica Piloto = new Musica("Piloto", "2019", YungBuda);
				Slot s131 = new Slot(1, 131, Piloto);
		
		Musica Pleasurekreft = new Musica("Pleasurekreft", "2019", YungBuda);
				Slot s132 = new Slot(1, 132, Pleasurekreft);
		
		Musica California = new Musica("California", "2019", YungBuda);
				Slot s133 = new Slot(1, 133, California);
		
		Musica AutumnRingMini = new Musica("Autumn Ring Mini", "2019", YungBuda);
				Slot s134 = new Slot(1, 134, AutumnRingMini);
				
		Musica SuzukiEscudo = new Musica("Suziki Escudo", "2019", YungBuda);
				Slot s135 = new Slot(1,135, SuzukiEscudo);
				
		Musica Autobahn = new Musica("Autobahn", "2019", YungBuda);
				Slot s136 = new Slot(1,136, Autobahn);
				
		Musica AkatsukiDeVila = new Musica("Akatsuki de Vila", "2017", YungBuda);
				Slot s137 = new Slot(1,137, AkatsukiDeVila);
					
		Musica JesusChorouPt2 = new Musica("Jesus Chorou Pt II", "2017", YungBuda);
				Slot s138 = new Slot(1,138, JesusChorouPt2);
			
		Musica SemSinal = new Musica("Sem Sinal", "2019", YungBuda);
				Slot s139 = new Slot(1, 139, SemSinal);
				
		Musica RejeiteFalsosIcones = new Musica("Rejeito Falsos Icones", "2021", YungBuda);
				Slot s140 = new Slot(1,140, RejeiteFalsosIcones);
				
				
				
				
		
		
		
		
				
				
				
		Musica LouisVMeninaLinda = new Musica("Louis V, Menina Linda", "2021", Sidoka );
				Slot s141 = new Slot(1,141, LouisVMeninaLinda);
				
		Musica NaoMeSintoMAlMais = new Musica("Nao Me SInto MAl MAis", "2019", Sidoka );
				Slot s142 = new Slot(1,142, NaoMeSintoMAlMais);
				
		Musica EstacionaEDesce = new Musica("Estaciona E Desce", "2019", Sidoka );
				Slot s143 = new Slot(1,143, EstacionaEDesce);
					
		Musica AiPreto = new Musica("Ai Preto", "2021", L7nnon );
				Slot s144 = new Slot(1,144, AiPreto);
			
		Musica Perdicao = new Musica("Perdição", "2020", L7nnon );
				Slot s145 = new Slot(1,145, Perdicao);

		Musica SeiQueTuGostaMuito = new Musica("Sei Que Tu Gosta Muito", "2022", L7nnon );
				Slot s146 = new Slot(1,146, SeiQueTuGostaMuito);
				
		Musica Metflix = new Musica("Metflix", "2022", PozeDoRodo );
				Slot s147 = new Slot(1,147, Metflix);
				
		Musica MeSintoAbencoado = new Musica("Me Sinto Abençoado", "2021", PozeDoRodo );
				Slot s148 = new Slot(1,148, SenteAMarra);
					
		Musica ACaraDocrime2 = new Musica("A Cara do Crime 2", "2019", PozeDoRodo );
				Slot s149 = new Slot(1,149, ACaraDocrime2);
			
		Musica Congratulation = new Musica("Congratulation", "2016", PostMalone );
				Slot s150 = new Slot(1,150, Reputation);
				
		Musica  LemonTree = new  Musica ( "Lemon Tree" , "2022" , PostMalone );
				Slot  s151 = new  Slot( 1 , 151 , LemonTree );
							
		Musica  Stay = new  Musica ( "stay" , "2016" , PostMalone );
	            Slot  s152 = new  Slot ( 1 , 152 , Stay );
	                    
	    Musica  Circle = new  Musica ( "Circle" , "2019" , PostMalone );
	            Slot  s153 = new  Slot ( 1 , 153 , Circle );
	                        
	    Musica  CandyPaint = new  Musica ( "Candy Paint" , "2019" , PostMalone );
	            Slot  s154 = new  Slot ( 1 , 154 , CandyPaint );
	                        
	    Musica  Goodbyes = new  Musica ( "Goodbyes" , "2019" , PostMalone );
	            Slot  s155 = new  Slot ( 1 , 155 , Goodbyes);
	                        
	    Musica  Baby = new  Musica ( "Baby" , "2010" , JustinBieber );
	            Slot  s156 = new  Slot ( 1 , 156 , Baby );
	                
	    Musica  OneTime = new  Musica ( "One Time" , "2022" , JustinBieber );
	            Slot  s157 = new  Slot ( 1 , 157 , OneTime );
	                            
	    Musica  Peaches = new  Musica ( "Peaches" , "2021" , JustinBieber );
	            Slot  s158 = new  Slot ( 1 , 158 , Marquinha );
	                    
	    Musica  Silence = new  Musica ( "Silence" , "2017" , Marshmellow);
	            Slot  s159 = new  Slot ( 1 , 159 , Silence );
	                        
	    Musica  Happier = new  Musica ( "Happier" , "2018" , Marshmellow );
	            Slot  s160 = new  Slot ( 1 , 160 , Happier );
	                
	    Musica  ComeOn = new  Musica ( "ComeOn" , "2022" , Marshmellow );
	            Slot  s161 = new  Slot ( 1 , 161 , ComeOn );
	                            
	    Musica  Better = new  Musica ( "Better" , "2018" , Khalid );
	            Slot  s162 = new  Slot ( 1 , 162 , RockNRoll );
	                    
	    Musica  Location = new  Musica ( "Location" , "2017" , Khalid );
	            Slot  s163 = new  Slot ( 1 , 163 , Location );
	                        
	    Musica  AmericaTeen = new  Musica ( "America Teen" , "2017" , Khalid );
	            Slot  s164 = new  Slot ( 1 , 164 , AmericaTeen );
	                        
	    Musica  Grenade = new  Musica ( "Grenade" , "2010" ,BrunoMars );
	            Slot  s165 = new  Slot ( 1 , 165 , Grenade );
	                        
	    Musica  CountOnMe = new  Musica ( "Count On Me" , "2010" , BrunoMars );
	            Slot  s166 = new  Slot ( 1 , 166 , CountOnMe );
	                
	    Musica  MarryYou = new  Musica ( "Marry You" , "2010" , BrunoMars );
	            Slot  s167 = new  Slot ( 1 , 167 , MarryYou );
	                            
	    Musica  Photograph = new  Musica ( "Photograph" , "2016" , EdSheeran );
	            Slot  s168 = new  Slot ( 1 , 168 , Photograph );
	                    
	    Musica  ShapeOfYou = new  Musica ( "Shape Of You" , "2017" , EdSheeran );
	            Slot  s169 = new  Slot ( 1 , 169 , ShapeOfYou);

	    Musica Perfect = new  Musica ( "Perfect" , "2017" , EdSheeran );
	            Slot  s170 = new  Slot ( 1 , 170 , Perfect );
	                
	    Musica  Yellow = new  Musica ( "Yellow" , "2000" , Coldplay );
	            Slot  s171 = new  Slot ( 1 , 171 , Yellow );
	                            
	    Musica  FixYou = new  Musica ( "Fix You" , "2005" , Coldplay );
	            Slot  s172 = new  Slot ( 1 , 172 , FixYou );
	                    
	    Musica  VivaLaVida = new  Musica ( "Viva La Vida" , "2008" , Coldplay );
	            Slot  s173 = new  Slot ( 1 , 173 , VivaLaVida );
	                        
	    Musica  LoveOfMine = new  Musica ( "LoveOfMine" , "2022" , ImagineDragons );
	            Slot  s174 = new  Slot ( 1 , 174 , WaterWater );
	                        
	    Musica  Beliver = new  Musica ( "Beliver" , "2017" , ImagineDragons );
	            Slot  s175 = new  Slot ( 1 , 175 , Beliver );
	                        
	    Musica  Birds = new  Musica ( "Birds" , "2020" , ImagineDragons );
	            Slot  s176 = new  Slot ( 1 , 176 , Birds );
	                
	    Musica  Chanel = new  Musica ( "Chanel" , "2017" , FrankOcean );
	            Slot  s177 = new  Slot ( 1 , 177 , Chanel );
	                            
	    Musica  Nights = new  Musica ( "Nights" , "2017" , FrankOcean );
	            Slot  s178 = new  Slot ( 1 , 178 , Nights );
	                    
	    Musica  A505 = new  Musica ( "505" , "2007" , ArticMonkeys );
	            Slot  s179 = new  Slot ( 1 , 179 , A505 );
	                
	    Musica  JaVirouRotina = new  Musica ( "Ja Virou Rotina" , "2022" , Pericles );
	            Slot s180 = new  Slot ( 1 , 180 , JaVirouRotina );
	            


	            
	            
	            
	            
	    Musica Brasa = new  Musica ( "Brasa" , "2022" , Pericles );
                Slot  s181 = new  Slot ( 1 , 181 , Brasa );
                    
        Musica  Lucidez = new  Musica ( "Lucidez" , "2022" , Pericles);
                Slot  s182 = new  Slot ( 1 , 182 , Lucidez );
            
        Musica  Envolver = new  Musica ( "Envolver" , "2021" , Anitta );
                Slot  s183 = new  Slot ( 1 ,183 , Envolver );
                
        Musica  LaLoto = new  Musica ( "LaLoto" , "2022" , Anitta );
                Slot  s184 = new  Slot ( 1 , 184 , LaLoto );
                
        Musica  VersionofMe = new  Musica ( "VersionOfMe" , "2022" , Anitta );
                Slot  s185 = new  Slot ( 1 , 185 , VersionofMe);
                
        Musica  WaterlmelonSugar = new  Musica ( "Watermelon Sugar" , "2021" , HarryStyle );
                Slot  s186 = new  Slot ( 1 , 186 , WaterlmelonSugar );
        
        Musica  AtItWas = new  Musica ( "At It Was" , "2022" , HarryStyle  );
                Slot  s187 = new  Slot ( 1 , 187 , AtItWas );
                    
        Musica  Matilda = new  Musica ( "Matilda" , "2022" , HarryStyle  );
                Slot  s188 = new  Slot ( 1 , 188 , Matilda );
            
        Musica  BetterNow = new  Musica ( "Better Now" , "2016" , PostMalone );
                Slot  s189 = new  Slot ( 1 , 189 , BetterNow );

        Musica  Psycho = new  Musica ( "Psycho" , "2016" , PostMalone );
                Slot  s190 = new  Slot ( 1 , 190 , Psycho );
        
        Musica  Boyfriend = new  Musica ( "Boyfriend" , "2013" , JustinBieber );
                Slot  s191 = new  Slot ( 1 , 191 , Boyfriend );
                    
        Musica  Allergic = new  Musica ( "Allergic" , "2019" , PostMalone );
                Slot  s192 = new  Slot ( 1 , 192 , Allergic );
            
        Musica  SaintTropez = new  Musica ( "Saint - Tropez" , "2019" , PostMalone );
                Slot  s193 = new  Slot ( 1 , 193 , SaintTropez );
                
        Musica  Somebody = new  Musica ( "Somebody" , "2021" , JustinBieber );
                Slot  s194 = new  Slot ( 1 , 194 , Somebody );
                
        Musica  Doutora3 = new  Musica ( "Doutora 3" , "2021" , McKevin );
                Slot  s195 = new  Slot ( 1 , 195 , Doutora3 );
                
        Musica  CavaloDeTroia = new  Musica ( "Cavalo de Troia" , "2019" , McKevin );
                Slot  s196 = new  Slot ( 1 , 196 , CavaloDeTroia );
        
        Musica  Cracolandia = new  Musica ( "Cracolândia" , "2019" , McHariel );
                Slot  s197 = new  Slot ( 1 , 197 , Cracolandia );
                    
        Musica  Sunflower = new  Musica ( "Sunflower" , "2018" , PostMalone );
                Slot  s198 = new  Slot ( 1 , 198 , Sunflower );
            
        Musica  internet = new  Musica ( "internet" , "2019" , PostMalone );
                Slot  s199 = new  Slot ( 1 , 199 , internet );

        Musica  Enemies = new  Musica ( "Enemies" , "2019" , PostMalone );
                Slot  s200 = new  Slot ( 1 , 199 , Enemies );

        Musica  NeverSayNever = new  Musica ( "Never Say Never" , "2010" , JustinBieber );
                Slot  s201 = new  Slot ( 1 , 201 , NeverSayNever );
        
        Musica  NoisTaBolandoUmPlano = new  Musica ( "Nois Ta Bolando Um Plano" , "2018" , McHariel );
                Slot  s202 = new  Slot ( 1 , 202 , NoisTaBolandoUmPlano );
        
        Musica  MacaVerde = new  Musica ( "Maçã Verde" , "2020" , McHariel);
                Slot  s203 = new  Slot ( 1 , 203 , MacaVerde );
            
        Musica  TiraDeGiro = new  Musica ( "Tira de Giro" , "2018" , McHariel );
                Slot  s204 = new  Slot ( 1 , 204 , TiraDeGiro );
    
        Musica  MoBrisa = new  Musica ( "Mo Brisa" , "2017" , McHariel );
                Slot  s205 = new  Slot ( 1 , 205 , MoBrisa );
        
        Musica  PraTeVer = new  Musica ( "Pra te Ver" , "2019" , McHariel );
                Slot  s206 = new  Slot ( 1 , 206 , PraTeVer );
                
        Musica  LeiDoRetorno = new  Musica ( "Lei Do Retorno" , "2017" , McHariel );
                Slot  s207 = new  Slot ( 1 , 207 , LeiDoRetorno );
                
        Musica  Obssessao = new  Musica ( "Obssessão" , "2017" , McHariel );
                Slot  s208 = new  Slot ( 1 , 208 , Obssessao );
        
        Musica  QuemTemDo = new  Musica ( "Quem tem Dó" , "2018" , McHariel );
                Slot  s209 = new  Slot ( 1 , 209 , QuemTemDo );
        
        Musica  CoracaoNaGeladeira = new  Musica ( "Coraçaõ na Geladeira" , "2017" , McHariel );
                Slot  s210 = new  Slot ( 1 , 210 , CoracaoNaGeladeira);
                
        Musica  Ressaca = new  Musica ( "Ressaca" , "2019" , McKevin );
                Slot  s211 = new  Slot ( 1 , 211 , Ressaca );
        
        Musica  Veracruz = new  Musica ( "Veracruz" , "2019" , McKevin );
                Slot  s212 = new  Slot ( 1 , 210 , LV );
        
        Musica  JogaBola = new  Musica ( "JogaBola" , "2019" , McKevin );
                Slot  s213 = new  Slot ( 1 , 213 , JogaBola );
        
        Musica  Clima = new  Musica ( "CLima" , "2019" , McKevin );
                Slot  s214 = new  Slot ( 1 , 214 , Clima );
        
        Musica  Vencedores = new  Musica ( "Vencedores" , "2019" , McKevin );
                Slot  s215 = new  Slot ( 1 , 215 , Vencedores );
        
        Musica  Bailao = new  Musica ( "Bailão" , "2019" , McKevin );
                Slot  s216 = new  Slot ( 1 , 216 , Bailao );
        
        Musica  Cavalinho = new  Musica ( "Cavalinho" , "2019" , McKevin );
                Slot  s217 = new  Slot ( 1 , 217 , Cavalinho );
        
        Musica  JaguarDoAno = new  Musica ( "JaguarDoAno" , "2021" , McKevin );
                Slot  s218 = new  Slot ( 1 , 218 , JaguarDoAno );
        
        Musica  VidaDeArtista = new  Musica ( "Vida De Artista" , "2021" , McKevin );
                Slot  s219 = new  Slot ( 1 , 219 , VidaDeArtista );
        
        Musica  PassarDeFoguetao = new  Musica ( "Passar De Foguetão" , "2021" , McKevin );
                Slot  s220 = new  Slot ( 1 , 220 , PassarDeFoguetao );
		

		
		
		
				
		
		
		
//================================================================
// dia 2 
		
				Slot a1 = new Slot(2,1, MiamiVice);
		
				Slot a2 = new Slot(2,2, Wave);
					
				Slot a3 = new Slot(2,3, Vlife);
			
				Slot a4 = new Slot(2, 4, Margiela);
				
				Slot a5 = new Slot(2,5, WaterWater);
				
				Slot a6 = new Slot(2,6, OnlyFans);
				
				Slot a7 = new Slot(2,7, Lilas);
		
				Slot a8 = new Slot(2,8, Highlights);
					
				Slot a9 = new Slot(2,9, a30Dias);
			
				Slot a10 = new Slot(2,10, RSS);
		
				Slot a11 = new Slot(2,11, LuisaSonza);
	
				Slot a12 = new Slot(2,12, ScoobyDoo);
			
				Slot a13 = new Slot(2,13, a360);
				
				Slot a14 = new Slot(2,14, ITOLDYOU);
				
				Slot a15 = new Slot(2,15, ForReal);
				
				Slot a16 = new Slot(2, 16, NoCap);
		
				Slot a17 = new Slot(2,17, FeFeFe);
					
				Slot a18 = new Slot(2,18, EuTenhoDrip);
			
				Slot a19 = new Slot(2,89, KylieJenner);
				
				Slot a20 = new Slot(2,20, PlayboyInternacional);
		
				Slot a21 = new Slot(2,21, Vilao);
		
				Slot a22 = new Slot(2,22, Monstro);
		
				Slot a23 = new Slot(2,23, HayabusaChromo);
		
				Slot a24 = new Slot(2,24, DriftDeYasuo);
		
				Slot a25 = new Slot(2,25, KatanaEPistola);
		
				Slot a26 = new Slot(2,26, RidersX);
		
				Slot a27 = new Slot(2,27, a7K);
		
				Slot a28 = new Slot(2,28, NewWave);
		
				Slot a29 = new Slot(2,29, OSegredoAlemDoJardim);
		
				Slot a30 = new Slot(2,30, Ninja);
		
				Slot a31 = new Slot(2,31, Piloto);
		
				Slot a32 = new Slot(2,32, Pleasurekreft);
		
				Slot a33 = new Slot(2,33, California);
		
				Slot a34 = new Slot(2,34, AutumnRingMini);
				
				Slot a35 = new Slot(2,35, SuzukiEscudo);
				
				Slot a36 = new Slot(2,36, Autobahn);
				
				Slot a37 = new Slot(2,37, AkatsukiDeVila);
					
				Slot a38 = new Slot(2,38, JesusChorouPt2);
			
				Slot a39 = new Slot(2,39, SemSinal);
				
				Slot a40 = new Slot(2,40, RejeiteFalsosIcones);
				
				Slot a41 = new Slot(2,41, Vampiro);
		
				Slot a42 = new Slot(2,42, SemDo);
		
				Slot a43 = new Slot(2,43, Groupies);
			
				Slot a44 = new Slot(2,44, QuerVoar);
	
				Slot a45 = new Slot(2,45, M4);
		
				Slot a46 = new Slot(2,46, Banco);
				
				Slot a47 = new Slot(2,47, AMorteDoAutotune);
				
				Slot a48 = new Slot(2,48, QuemMandaEA30);
		
				Slot a49 = new Slot(2,49, BalAzul);
		
				Slot a50 = new Slot(2,50, TavaBom);
		
				Slot a51 = new Slot(2,51, UmaBala);
		
				Slot a52 = new Slot(2,52, KennyG);
		
				Slot a53 = new Slot(2,53, a777666);
		
				Slot a54 = new Slot(2,54, Antes);
		
				Slot a55 = new Slot(2,55, ESal);
		
				Slot a56 = new Slot(2,56, MaquinaDoTempo);
		
				Slot a57 = new Slot(2,57, Cogulandia);
		
				Slot a58 = new Slot(2,58, Manha);
		
				Slot a59 = new Slot(2,59, DiaAzul);
		
				Slot a60 = new Slot(2,60, Fashion);
				
                		Slot a61 = new Slot(2,61, ComeOn );         

                		Slot a62 = new Slot(2,62, RockNRoll );
           
                		Slot a63 = new Slot(2,63, Location );
                
                		Slot a64 = new Slot(2,64, AmericaTeen );
               
                		Slot a65 = new Slot(2,65, Grenade );
                
                		Slot a66 = new Slot(2,66, CountOnMe );
        
                		Slot a67 = new Slot(2,67, MarryYou );
                   
                		Slot a68 = new Slot(2,68, Photograph );
            
                		Slot a69 = new Slot(2,69, ShapeOfYou);

                		Slot a70 = new Slot(2,70, Perfect );
                
				Slot a71 = new Slot(2,71, LouisVMeninaLinda);
				
				Slot a72 = new Slot(2, 72, NaoMeSintoMAlMais);
				
				Slot a73 = new Slot(2,73, EstacionaEDesce);
					
				Slot a74 = new Slot(2,74, AiPreto);
			
				Slot a75 = new Slot(2,75, Perdicao);

				Slot a76 = new Slot(2,76, SeiQueTuGostaMuito);
				
				Slot a77 = new Slot(2,77, Metflix);
				
				Slot a78 = new Slot(2,78, SenteAMarra);
					
				Slot a79 = new Slot(2,79, ACaraDocrime2);
			
				Slot a80 = new Slot(2,80, Reputation);
				
				Slot a81 = new  Slot(2,81, LemonTree );
		
			    Slot a82 = new Slot (2,82, Stay );

			    Slot a83 = new Slot (2,83, Circle );

			    Slot a84 = new Slot (2,84, CandyPaint );

			    Slot a85 = new Slot (2,85, Goodbyes);

			    Slot a86 = new Slot (2,86, Baby );

			    Slot a87 = new Slot (2,87, OneTime );

			    Slot a88 = new Slot (2,88, Marquinha );

			    Slot a89 = new Slot (2,89, Silence );

			    Slot a90 = new Slot (2,90, Happier );

			    Slot a91 = new Slot (2,91, Yellow );

			    Slot a92 = new  Slot (2,92, FixYou );

			    Slot  a93 = new  Slot ( 2 , 93 , VivaLaVida );

			    Slot  a94 = new  Slot ( 2 , 94 , WaterWater );

			    Slot  a95 = new  Slot ( 2 , 95 , Beliver );

			    Slot  a96 = new  Slot ( 2 , 96 , Birds );

			    Slot  a97 = new  Slot ( 2 , 97 , Chanel );

			    Slot  a98 = new  Slot ( 2 , 98 , Nights );

			    Slot  a99 = new  Slot ( 2 , 99 , A505 );

			    Slot a100 = new  Slot ( 2 , 100 , JaVirouRotina );
			
			
				
				
//================================================================
// inserindo dia 1 
				
				
		radio.inserir(s1);
		radio.inserir(s2);
		radio.inserir(s3);
		radio.inserir(s4);
		radio.inserir(s5);
		radio.inserir(s6);
		radio.inserir(s7);
		radio.inserir(s8);
		radio.inserir(s9);
		radio.inserir(s10);
		radio.inserir(s11);
		radio.inserir(s12);
		radio.inserir(s13);
		radio.inserir(s14);
		radio.inserir(s15);
		radio.inserir(s16);
		radio.inserir(s17);
		radio.inserir(s18);
		radio.inserir(s19);
		radio.inserir(s20);
		radio.inserir(s21);
		radio.inserir(s22);
		radio.inserir(s23);
		radio.inserir(s24);
		radio.inserir(s25);
		radio.inserir(s26);
		radio.inserir(s27);
		radio.inserir(s28);
		radio.inserir(s29);
		radio.inserir(s30);
		radio.inserir(s31);
		radio.inserir(s32);
		radio.inserir(s33);
		radio.inserir(s34);
		radio.inserir(s35);
		radio.inserir(s36);
		radio.inserir(s37);
		radio.inserir(s38);
		radio.inserir(s39);
		radio.inserir(s40);
		radio.inserir(s41);
		radio.inserir(s42);
		radio.inserir(s43);
		radio.inserir(s44);
		radio.inserir(s45);
		radio.inserir(s46);
		radio.inserir(s47);
		radio.inserir(s48);
		radio.inserir(s49);
		radio.inserir(s50);
		radio.inserir(s51);
		radio.inserir(s52);
		radio.inserir(s53);
		radio.inserir(s54);
		radio.inserir(s55);
		radio.inserir(s56);
		radio.inserir(s57);
		radio.inserir(s58);
		radio.inserir(s59);
		radio.inserir(s60);
		radio.inserir(s61);
		radio.inserir(s62);
		radio.inserir(s63);
		radio.inserir(s64);
		radio.inserir(s65);
		radio.inserir(s66);
		radio.inserir(s67);
		radio.inserir(s68);
		radio.inserir(s69);
		radio.inserir(s70);
		radio.inserir(s71);
		radio.inserir(s72);
		radio.inserir(s73);
		radio.inserir(s74);
		radio.inserir(s75);
		radio.inserir(s76);
		radio.inserir(s77);
		radio.inserir(s78);
		radio.inserir(s79);
		radio.inserir(s80);
		radio.inserir(s91);
		radio.inserir(s92);
		radio.inserir(s93);
		radio.inserir(s94);
		radio.inserir(s95);
		radio.inserir(s96);
		radio.inserir(s97);
		radio.inserir(s98);
		radio.inserir(s99);
		radio.inserir(s100);
		radio.inserir(s101);
		radio.inserir(s102);
		radio.inserir(s103);
		radio.inserir(s104);
		radio.inserir(s105);
		radio.inserir(s106);
		radio.inserir(s107);
		radio.inserir(s108);
		radio.inserir(s109);
		radio.inserir(s110);
		radio.inserir(s111);
		radio.inserir(s112);
		radio.inserir(s113);
		radio.inserir(s114);
		radio.inserir(s115);
		radio.inserir(s116);
		radio.inserir(s117);
		radio.inserir(s118);
		radio.inserir(s119);
		radio.inserir(s120);
		radio.inserir(s121);
		radio.inserir(s122);
		radio.inserir(s123);
		radio.inserir(s124);
		radio.inserir(s125);
		radio.inserir(s126);
		radio.inserir(s127);
		radio.inserir(s128);
		radio.inserir(s129);
		radio.inserir(s130);
		radio.inserir(s131);
		radio.inserir(s132);
		radio.inserir(s133);
		radio.inserir(s134);
		radio.inserir(s135);
		radio.inserir(s136);
		radio.inserir(s137);
		radio.inserir(s138);
		radio.inserir(s139);
		radio.inserir(s140);
		
		
//================================================================
// inserindo dia 2 
		
		
		radio.inserir(a1);
		radio.inserir(a2);
		radio.inserir(a3);
		radio.inserir(a4);
		radio.inserir(a5);
		radio.inserir(a6);
		radio.inserir(a7);
		radio.inserir(a8);
		radio.inserir(a9);
		radio.inserir(a10);
		radio.inserir(a11);
		radio.inserir(a12);
		radio.inserir(a13);
		radio.inserir(a14);
		radio.inserir(a15);
		radio.inserir(a16);
		radio.inserir(a17);
		radio.inserir(a18);
		radio.inserir(a19);
		radio.inserir(s20);
		radio.inserir(a21);
		radio.inserir(a22);
		radio.inserir(a23);
		radio.inserir(a24);
		radio.inserir(a25);
		radio.inserir(a26);
		radio.inserir(a27);
		radio.inserir(a28);
		radio.inserir(a29);
		radio.inserir(a30);
		radio.inserir(a31);
		radio.inserir(a32);
		radio.inserir(a33);
		radio.inserir(a34);
		radio.inserir(a35);
		radio.inserir(a36);
		radio.inserir(a37);
		radio.inserir(a38);
		radio.inserir(a39);
		radio.inserir(a40);
		radio.inserir(a41);
		radio.inserir(a42);
		radio.inserir(a43);
		radio.inserir(a44);
		radio.inserir(a45);
		radio.inserir(a46);
		radio.inserir(a47);
		radio.inserir(a48);
		radio.inserir(a49);
		radio.inserir(a50);
		radio.inserir(a51);
		radio.inserir(a52);
		radio.inserir(a53);
		radio.inserir(a54);
		radio.inserir(a55);
		radio.inserir(a56);
		radio.inserir(a57);
		radio.inserir(a58);
		radio.inserir(a59);
		radio.inserir(a60);
		radio.inserir(a61);
		radio.inserir(a62);
		radio.inserir(a63);
		radio.inserir(a64);
		radio.inserir(a65);
		radio.inserir(a66);
		radio.inserir(a67);
		radio.inserir(a68);
		radio.inserir(a69);
		radio.inserir(a70);
		radio.inserir(a71);
		radio.inserir(a72);
		radio.inserir(a73);
		radio.inserir(a74);
		radio.inserir(a75);
		radio.inserir(a76);
		radio.inserir(a77);
		radio.inserir(a78);
		radio.inserir(a79);
		radio.inserir(a80);
		radio.inserir(a81);
		radio.inserir(a82);
		radio.inserir(a83);
		radio.inserir(a84);
		radio.inserir(a85);
		radio.inserir(a86);
		radio.inserir(a87);
		radio.inserir(a88);
		radio.inserir(a89);
		radio.inserir(a90);
		radio.inserir(a91);
		radio.inserir(a92);
		radio.inserir(a93);
		radio.inserir(a94);
		radio.inserir(a95);
		radio.inserir(a96);
		radio.inserir(a97);
		radio.inserir(a98);
		radio.inserir(a99);
		radio.inserir(a100);
		
//================================================================
		
		System.out.println(s1.dscrição());
		System.out.println(s2.dscrição());
		System.out.println(s3.dscrição());
		System.out.println(s4.dscrição());
		System.out.println(s5.dscrição());
		
		System.out.println("===============================================");
		System.out.println("\nSegue a Lista de Musicas do dia");
		System.out.println("\n===============================================");
		
		
		radio.buscarDia(2);
	
		
		
	
		
	}
}
