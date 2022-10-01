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
		// a - 2 -
		// b - 3
		// c - 4
		// d - 5 -
		// e - 6
		// f - 7
		// g - 8 - 
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
		Artista BlackAlien = new Artista("Black Alien", "São Paulo", "40");
		Artista McIgu = new Artista("Mc igu", "São Paulo", "26");
		
		
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
		Artista MCCabelinho = new Artista("MCCabelinho", "Rio de Janeiro", "25");
		Artista Chefin = new Artista("Chefin", "Rio de Janeiro", "20");
		Artista FilipeRet = new Artista("FilipeRet", "Rio de janeiro", "28");
		Artista DJMattD = new Artista("DJMattD", "São Paulo", "27");
		Artista BIN = new Artista("BIN", "Saõ Paulo", "26");
		Artista Kweller = new Artista("Kweller", "Roraima", "29");
		Artista Alee = new Artista("Alee", "Rio de janeiro", "20");
		
		
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
				Slot s150 = new Slot(1,150, Congratulation);
				
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
	            Slot  s174 = new  Slot ( 1 , 174 , LoveOfMine);
	                        
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
                
                
                
                
                
                
        Musica Quarto= new Musica("Quarto","2022",Japa);
       			Slot s221 = new Slot(1, 221, Quarto);
       			
        Musica Arigato= new Musica("Arigato","2022",Japa);
        		Slot  s222 = new Slot(1, 222, Arigato);
        		
        Musica Playboy= new Musica("Playboy","2022",Japa);
        		Slot s223 = new Slot(1, 223, Playboy);
        		
        Musica Japao= new Musica("Japao","2022",Japa);
        		Slot s224 = new Slot(1, 224, Japao);
        		
        Musica NoTies= new Musica("NoTies","2022",Japa);
        		Slot  s225 = new Slot(1, 225, NoTies);
        		
        Musica VVS= new Musica("VVS","2022",Japa);
        		Slot  s226 = new Slot(1, 226, VVS);
        		
        Musica DNA= new Musica("DNA","2022",Japa);
        		Slot  s227 = new Slot(1, 227, DNA);
        		
        Musica AguasRasas= new Musica("AguasRasas","2022",Japa);
        		Slot  s228 = new Slot(1, 228, AguasRasas);
        		
        Musica YE= new Musica("YE","2022",Japa);
        		Slot  s229 = new Slot(1, 229, YE);
        		
        Musica DreamGirl= new Musica("DreamGirl","2022",Japa);
        		Slot  s230 = new Slot(1, 230, DreamGirl);
        		
        Musica Kurt= new Musica("Kurt","2022",Japa);
        		Slot s231 = new Slot(1, 231, Kurt);
        		
        Musica MiraInterludio= new Musica("MiraInterludio","2022",Japa);
        		Slot s232 = new Slot(1, 232, MiraInterludio);
        		
        		

        		Musica NeSegredo= new Musica("NeSegredo","2020",MCCabelinho);
        		Slot s233 = new Slot(1, 233, NeSegredo);
        		
        		Musica Posturadao= new Musica("Posturadao","2020",FilipeRet);
        		Slot s234 = new Slot(1, 234, Posturadao);
        		
        		Musica Maturidade= new Musica("Maturidade","2020",KayBlack);
        		Slot s235 = new Slot(1, 235, Maturidade);
        		
        		Musica a7Meiota= new Musica("7Meiota","2020",FilipeRet);
        		Slot s236 = new Slot(1, 236, a7Meiota);
        		
        		Musica Kweller202= new Musica("202","2020",Kweller);
        		Slot s237 = new Slot(1, 237, Kweller202);
        		
        		Musica ConhecoBem= new Musica("ConhecoBem","2020",Kweller);
        		Slot s238 = new Slot(1, 238, ConhecoBem);
        		
        		Musica Dior= new Musica("Dior","2020",BIN);
        		Slot s239 = new Slot(1, 239, Dior);
        		
        		Musica Bahia= new Musica("Bahia","2020",Alee);
        		Slot s240 = new Slot(1, 240, Bahia);
        		
        		Musica OutroPatamar= new Musica("OutroPatamar","2020",BIN);
        		Slot s241 = new Slot(1, 241, OutroPatamar);
        		
        		Musica Ochamado= new Musica("Ochamado","2020",Chefin);
        		Slot s242 = new Slot(1, 242, Ochamado);
        		
        		Musica Chefin212= new Musica("212","2020",Chefin);
        		Slot s243 = new Slot(1, 243, Chefin212);
        		
        		Musica Pandora= new Musica("Pandora","2020",DJMattD);
        		Slot s244 = new Slot(1, 244, Pandora);
        		
        		Musica FFM= new Musica("F*F*M*","2020",FilipeRet);
        		Slot s245 = new Slot(1, 245, FFM);
        		
        		Musica CoopedUp= new Musica("CoopedUp","2020",PostMalone);
        		Slot s246 = new Slot(1, 246, CoopedUp);
        		
        		Musica ICEONMYWRIST= new Musica("ICEONMYWRIST","2021",Derek);
        		Slot s247 = new Slot(1, 247, ICEONMYWRIST);
        		
        		Musica Insane= new Musica("Insane","2020",PostMalone);
        		Slot s248 = new Slot(1, 248, Insane);
        		
        		Musica WrappedAroundYourFinger= new Musica("WrappedAroundYourFinger","2020",PostMalone);
        		Slot s249 = new Slot(1, 249, WrappedAroundYourFinger);
        		
        		Musica ILikeYou= new Musica("ILikeYou","2020",PostMalone);
        		Slot s250 = new Slot(1, 250, ILikeYou);
        		
        		Musica ICannotBe= new Musica("ICannotBe","2020",PostMalone);
        		Slot s251 = new Slot(1, 251, ICannotBe);
        		
        		Musica LoveHate= new Musica("Love/Hate","2020",PostMalone);
        		Slot s252 = new Slot(1, 252, LoveHate);
        		
        		Musica Euthanasia= new Musica("Euthanasia","2020",PostMalone);
        		Slot s253 = new Slot(1, 253, Euthanasia);
        		
        		Musica WhenImAlone= new Musica("WhenImAlone","2020",PostMalone);
        		Slot s254 = new Slot(1, 254, WhenImAlone);
        		
        		Musica Hateful= new Musica("Hateful","2020",PostMalone);
        		Slot s255 = new Slot(1, 255, Hateful);
        		
        		Musica Gangshit= new Musica("gangshit","2021",Derek);
        		Slot s256 = new Slot(1, 256, Gangshit);
        		
        		Musica Circles= new Musica("Circles","2020",PostMalone);
        		Slot s257 = new Slot(1, 257, Circles);
        		
        		Musica BondeDaFumaca= new Musica("Bonde da Fumaca","2021",Derek);
        		Slot s258 = new Slot(1, 258, BondeDaFumaca);
        		
        		Musica MlksDeSP= new Musica("Mlks de SP","2020",Derek);
        		Slot s259 = new Slot(1, 259, MlksDeSP);
        		
        		Musica HollywoodsBleeding= new Musica("HollywoodsBleeding","2020",PostMalone);
        		Slot s260 = new Slot(1, 260, HollywoodsBleeding);
        		
        		Musica DieForMe= new Musica("DieForMe","2020",PostMalone);
        		Slot s261 = new Slot(1, 261, DieForMe);
        		
        		Musica OnTheRoad= new Musica("OnTheRoad","2020",PostMalone);
        		Slot s262 = new Slot(1, 262, OnTheRoad);
        		
        		Musica TakaWhatYouWant= new Musica("TakaWhatYouWant","2020",PostMalone);
        		Slot s263 = new Slot(1, 263, TakaWhatYouWant);
        		
        		Musica ImGonnaBe= new Musica("ImGonnaBe","2020",PostMalone);
        		Slot s264 = new Slot(1, 264, ImGonnaBe);
        		
        		Musica Internet= new Musica("Internet","2020",PostMalone);
        		Slot s265 = new Slot(1, 265, Internet);
        		
        		Musica Plaqtudum= new Musica("Plaqtudum","2018",Derek);
        		Slot s266 = new Slot(1, 266, Plaqtudum);
        		
        		Musica FlackJack= new Musica("FlackJack","2018",Derek);
        		Slot s267 = new Slot(1, 267, FlackJack);
        		
        		Musica Myself= new Musica("Myself","2020",PostMalone);
        		Slot s268 = new Slot(1, 268, Myself);
        		
        		Musica Iknow= new Musica("Iknow","2020",PostMalone);
        		Slot s269 = new Slot(1, 269, Iknow);
        		
        		Musica WOW= new Musica("WOW","2020",PostMalone);
        		Slot s270 = new Slot(1, 270, WOW);
        		
        		Musica Paranoid= new Musica("Paranoid","2020",PostMalone);
        		Slot s271 = new Slot(1, 271, Paranoid);
        		
        		Musica SpoilMyNight= new Musica("SpoilMyNight","2020",PostMalone);
        		Slot s272 = new Slot(1, 272, SpoilMyNight);
        		
        		Musica RichESad= new Musica("Rich&Sad","2020",PostMalone);
        		Slot s273 = new Slot(1, 273, RichESad);
        		
        		Musica ZackAndCodeine= new Musica("ZackAndCodeine","2020",PostMalone);
        		Slot s274 = new Slot(1, 274, ZackAndCodeine);
        		
        		Musica TakinShots= new Musica("TakinShots","2020",PostMalone);
        		Slot s275 = new Slot(1, 275, TakinShots);
        		
        		Musica Rockstar= new Musica("Rockstar","2020",PostMalone);
        		Slot s276 = new Slot(1, 276, Rockstar);
        		
        		Musica OverNow= new Musica("OverNow","2020",PostMalone);
        		Slot s277 = new Slot(1, 277, OverNow);
        		
        		Musica Uzi2= new Musica("Uzi 2","2018",Derek);
        		Slot s278 = new Slot(1, 278, Uzi2);
        		
        		Musica Doko= new Musica("Doko","2016",McIgu);
        		Slot s279 = new Slot(1, 279, Doko);
        		
        		Musica BallForMe= new Musica("BallForMe","2020",PostMalone);
        		Slot s280 = new Slot(1, 280, BallForMe);
        		
        		Musica Otherside= new Musica("Otherside","2020",PostMalone);
        		Slot s281 = new Slot(1, 281, Otherside);
        		
        		Musica AkDoJapao = new Musica("Ak do japao","2020",McIgu);
        		Slot s282 = new Slot(1, 282, AkDoJapao);
        		
        		Musica BlameItOnMe= new Musica("BlameItOnMe","2020",PostMalone);
        		Slot s283 = new Slot(1, 283, BlameItOnMe);
        		
        		Musica SameBitches= new Musica("SameBitches","2020",PostMalone);
        		Slot s284 = new Slot(1, 284, SameBitches);
        		
        		Musica Jonestown= new Musica("Jonestown","2020",PostMalone);
        		Slot s285 = new Slot(1, 285, Jonestown);
        		
        		Musica a92Explorer= new Musica("92Explorer","2020",PostMalone);
        		Slot s286 = new Slot(1, 286, a92Explorer);
        		
        		Musica Franca= new Musica("Franca","2018",McIgu);
        		Slot s287 = new Slot(1, 287, Franca);
        		
        		Musica SugarWraith= new Musica("SugarWraith","2020",PostMalone);
        		Slot s288 = new Slot(1, 288, SugarWraith);
        		
        		Musica BigLie= new Musica("BigLie","2020",PostMalone);
        		Slot s289 = new Slot(1, 289, BigLie);
        		
        		Musica DejaVu= new Musica("DejaVu","2020",PostMalone);
        		Slot s290 = new Slot(1, 290, DejaVu);
        		
        		Musica NoOption= new Musica("NoOption","2020",PostMalone);
        		Slot s291 = new Slot(1, 291, NoOption);
        		
        		Musica Cold= new Musica("Cold","2020",PostMalone);
        		Slot s292 = new Slot(1, 292, Cold);
        		
        		Musica Patient= new Musica("Patient","2020",PostMalone);
        		Slot s293 = new Slot(1, 293, Patient);
        		
        		Musica GoFlex= new Musica("GoFlex","2020",PostMalone);
        		Slot s294 = new Slot(1, 294, GoFlex);
        		
        		Musica Feel= new Musica("Feel","2020",PostMalone);
        		Slot s295 = new Slot(1, 295, Feel);
        		
        		Musica TooYoug= new Musica("TooYoug","2020",PostMalone);
        		Slot s296 = new Slot(1, 296, TooYoug);
        		
        		Musica Congratulations= new Musica("Congratulations","2020",PostMalone);
        		Slot s297 = new Slot(1, 297, Congratulations);
        		
        		Musica UpThere= new Musica("UpThere","2020",PostMalone);
        		Slot s298 = new Slot(1, 298, UpThere);
        		
        		Musica Leave= new Musica("Leave","2020",PostMalone);
        		Slot s299 = new Slot(1, 299, Leave);
        		
        		Musica HitThisHard= new Musica("HitThisHard","2020",PostMalone);
        		Slot s300 = new Slot(1, 300, HitThisHard);
        		
        		
        		
       
		

		Musica ComoEuTeQuero = new Musica("Como eu Te Quero", "2009", BlackAlien);
		
		
				
		
		
		
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
			
				Slot a80 = new Slot(2,80, Congratulation);
				
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
	                        
	            Slot  a94 = new  Slot ( 2 , 94 , LoveOfMine);
	                        
	            Slot  a95 = new  Slot ( 2 , 95 , Beliver );
	                        
	            Slot  a96 = new  Slot ( 2 , 96 , Birds );
	                
	            Slot  a97 = new  Slot ( 2 , 97 , Chanel );
	                            
	            Slot  a98 = new  Slot ( 2 , 98 , Nights );
	                    
	            Slot  a99 = new  Slot ( 2 , 99 , A505 );
	                
	            Slot a100 = new  Slot ( 2 , 100 , JaVirouRotina );
	            
				Slot a101 = new Slot(2, 101, Agua);
		
				Slot a102 = new Slot(2, 102, OkBaby);
		
				Slot a103 = new Slot(2, 103, Rn);
		
				Slot a104 = new Slot(2, 104, Dejavu);
		
				Slot a105 = new Slot(2, 105, Osaka);
		
				Slot a106 = new Slot(2, 106, Kyoto);
		
				Slot a107 = new Slot(2, 107, DieForYou);
		
				Slot a108 = new Slot(2, 108, a2036);
		
				Slot a109 = new Slot(2, 109, High);
		
				Slot a110 = new Slot(2, 110, SpikeLee);
		
				Slot a112 = new Slot(2, 112, Yokono);
				
				Slot a111 = new Slot(2, 111, ComoEuTeQuero);
		
				Slot a113 = new Slot(2, 113, Salao);
		
				Slot a114 = new Slot(2, 114, QuemEQuem);
		
				Slot a115 = new Slot(2, 115, Prada);
				
				Slot a116 = new Slot(2, 116, POCPOC);
				
				Slot a117 = new Slot(2, 117, JackBauer);
				
				Slot a118 = new Slot(2, 118, Honda);
		
				Slot a119 = new Slot(2, 119, TT);
		
				Slot a120 = new Slot(2, 120, Rush);
				
				Slot a121 = new Slot(2, 121, Balenciaga);
		
				Slot a122 = new Slot(2, 122, LV);
		
				Slot a123 = new Slot(2, 123, Snakes);
		
				Slot a124 = new Slot(2, 124, Mob);
		
				Slot a125 = new Slot(2, 125, NovoRico);
		
				Slot a126 = new Slot(2, 126, Netflix);
		
				Slot a127 = new Slot(2, 127, Dinero);
		
				Slot a128 = new Slot(2, 128, VidaDeChafe);
		
				Slot a129 = new Slot(2, 129, TipoGiroflex);
				
				Slot a130 = new Slot(2, 130, OPretoMaiscaro);
		
				Slot a131 = new Slot(2,131, DoubleCup);
					
				Slot a132 = new Slot(2,132, Evoque);
			
				Slot a133 = new Slot(2,133, a212Vip);
		
				Slot a134 = new Slot(2, 134, Flash);
		
				Slot a135 = new Slot(2,135, Medina);
		
				Slot a136 = new Slot(2,136, TipoGTA);
		
				Slot a137 = new Slot(2,137, NaoPisaNoMeuBoot);
			
				Slot a138 = new Slot(2,138, OPaiTaOn);
	
				Slot a139 = new Slot(2,139, SeSegura);
				
				Slot a140 = new Slot(2,140, VestidoDaFendi);
	
				Slot a141 = new Slot(2,141, Licor43);
					
				Slot a142 = new Slot(2,142, Lembrancas);
			
				Slot a143 = new Slot(2, 143, Tralha);
				
				Slot a144 = new Slot(2,144, FogueteDaNasa);
				
				Slot a145 = new Slot(2,145, Freestyle);
				
                Slot a146 = new  Slot (2 , 146 , Brasa );
                    
                Slot  a147 = new  Slot ( 2 , 147 , Lucidez );
            
                Slot  a148 = new  Slot ( 2 ,148 , Envolver );
                
                Slot  a149 = new  Slot ( 2 , 149 , LaLoto );
                
                Slot  a150 = new  Slot ( 2 , 150 , VersionofMe);
                
                Slot  a151 = new  Slot ( 2 , 151 , WaterlmelonSugar );
        
                Slot  a152 = new  Slot ( 2 , 152 , AtItWas );
                    
                Slot  a153 = new  Slot ( 2 , 153 , Matilda );
            
                Slot  a154 = new  Slot ( 2 , 154 , BetterNow );

                Slot  a155 = new  Slot ( 2 , 155 , Psycho );
        
                Slot  a156 = new  Slot ( 2 , 156 , Boyfriend );
                    
                Slot  a157 = new  Slot ( 2 , 157 , Allergic );
            
                Slot  a158 = new  Slot ( 2 , 157 , SaintTropez );
                
                Slot  a159 = new  Slot ( 2 , 159 , Somebody );
                
                Slot  a160 = new  Slot ( 2 , 160 , Doutora3 );
                
                Slot  a161 = new  Slot ( 2 , 161 , CavaloDeTroia );
        
                Slot  a162 = new  Slot ( 2 , 162 , Cracolandia );
                    
                Slot  a163 = new  Slot ( 2 , 163 , Sunflower );
            
                Slot  a164 = new  Slot ( 2 , 164 , internet );

                Slot  a165 = new  Slot ( 2 , 165 , Enemies );

                Slot  a166 = new  Slot ( 2 , 166 , NeverSayNever );
        
                Slot  a167 = new  Slot ( 2 , 167 , NoisTaBolandoUmPlano );
        
                Slot  a168 = new  Slot ( 2 , 168 , MacaVerde );
            
                Slot  a169 = new  Slot ( 2 , 169 , TiraDeGiro );
    
                Slot  a170 = new  Slot ( 2 , 170 , MoBrisa );
        
                Slot  a171 = new  Slot ( 2 , 171 , PraTeVer );
                
                Slot  a172 = new  Slot ( 2 , 172 , LeiDoRetorno );
                
                Slot  a173 = new  Slot ( 2 , 173 , Obssessao );
        
                Slot  a174 = new  Slot ( 2 , 174 , QuemTemDo );
        
                Slot  a175 = new  Slot ( 2 , 175 , CoracaoNaGeladeira);
                
                Slot  a176 = new  Slot ( 2 , 176 , Ressaca );
        
                Slot  a177 = new  Slot ( 2 , 177 , LV );
        
                Slot  a178 = new  Slot ( 2 , 178 , JogaBola );
        
                Slot  a179 = new  Slot ( 2 , 179 , Clima );
        
                Slot  a180 = new  Slot ( 2 , 180 , Vencedores );
        
                Slot  a181 = new  Slot ( 2 , 181 , Bailao );
        
                Slot  a182 = new  Slot ( 2 , 182 , Cavalinho );
        
                Slot  a183 = new  Slot ( 2 , 183 , JaguarDoAno );
        
                Slot  a184 = new  Slot ( 2 , 184 , VidaDeArtista );
        
                Slot  a185 = new  Slot ( 2 , 185 , PassarDeFoguetao );
                
				Slot a186 = new Slot(2,186, DinheiroMeSonda);
				
				Slot a187 = new Slot(2, 187, Forbes);
		
				Slot a188 = new Slot(2,188, ElaRebolaPraMimeSenta);
					
				Slot a189 = new Slot(2,189, Marquinha);
			
				Slot a190 = new Slot(2, 190, MeninoBom);
				
				Slot a191 = new Slot(2,191, EuSoDeslizo);
		
				Slot a192 = new Slot(2,192, DripdeNegao);
					
				Slot a193 = new Slot(2,193, RockNRoll);
			
				Slot a194 = new Slot(2, 194, PretoRico);
				
				Slot a195 = new Slot(2,195, TranseiComAMorte);
				
				Slot a196 = new Slot(2,196, Cassino);
				
				Slot a197 = new Slot(2,197, SuaSafada);
		
				Slot a198 = new Slot(2,198, Oracao);
					
				Slot a199 = new Slot(2,199, Progresso);
			
				Slot a200 = new Slot(2,200, DizQueEHoje);
				
				Slot a201 = new Slot(2,201, Felina);
					
				Slot a202 = new Slot(2,202, Sertao);
			
				Slot a203 = new Slot(2,203, AmigaTalarica);
				
				Slot a204 = new Slot(2,204, Pitbull);
		
				Slot a205 = new Slot(2,205, LagrimasDecrocodilo);
					
				Slot a206 = new Slot(2,206, Obraz);
			
				Slot a207 = new Slot(2, 207, Mantem);
				
				Slot a208 = new Slot(2,208, Sucrilhos);
				
				Slot a209 = new Slot(2,209, OCaveiraoChegou);
				
				Slot a210 = new Slot(2,210, OMaestroDosFluxos);
				
				Slot a211 = new Slot(2,211, HinoDosParedoes);
					
				Slot a212 = new Slot(2,212, Liberdade);
			
				Slot a213 = new Slot(2, 213, MegaRaveSemChao);
				
				Slot a214 = new Slot(2,214, RaveDaSirene);

				Slot a215 = new Slot(2,215, IrmaGostosa);
				
				Slot a216 = new Slot(2,216, FazerFalta);
				
				Slot a217 = new Slot(2,217, SenteAMarra);
					
				Slot a218 = new Slot(2,218, CalendarioDoPapai);
			
				Slot a219 = new Slot(2,219, ToGostandoTantoDeVoce);
				
				Slot a220 = new Slot(2, 220, Reputation);
				
				
				
//================================================================
// dia 5 
        
	            Slot d1 = new Slot(5,1, MiamiVice);
	    
	            Slot d2 = new Slot(5,2, Wave);
	                
	            Slot d3 = new Slot(5,3, Vlife);
	        
	            Slot d4 = new Slot(5, 4, Margiela);
	            
	            Slot d5 = new Slot(5,5, WaterWater);
	            
	            Slot d6 = new Slot(5,6, OnlyFans);
	            
	            Slot d7 = new Slot(5,7, Lilas);
	    
	            Slot d8 = new Slot(5,8, Highlights);
	                
	            Slot d9 = new Slot(5,9, a30Dias);
	        
	            Slot d10 = new Slot(5,10, RSS);
	    
	            Slot d11 = new Slot(5,11, LuisaSonza);
	
	            Slot d12 = new Slot(5,12, ScoobyDoo);
	        
	            Slot d13 = new Slot(5,13, a360);
	            
	            Slot d14 = new Slot(5,14, ITOLDYOU);
	            
	            Slot d15 = new Slot(5,15, ForReal);
	            
	            Slot d16 = new Slot(5, 16, NoCap);
	    
	            Slot d17 = new Slot(5,17, FeFeFe);
	                
	            Slot d18 = new Slot(5,18, EuTenhoDrip);
	        
	            Slot d19 = new Slot(5,89, KylieJenner);
	            
	            Slot d20 = new Slot(5,20, PlayboyInternacional);
	    
	            Slot d21 = new Slot(5,21, Vilao);
	    
	            Slot d22 = new Slot(5,22, Monstro);
	    
	            Slot d23 = new Slot(5,23, HayabusaChromo);
	    
	            Slot d24 = new Slot(5,24, DriftDeYasuo);
	    
	            Slot d25 = new Slot(5,25, KatanaEPistola);
	    
	            Slot d26 = new Slot(5,26, RidersX);
	    
	            Slot d27 = new Slot(5,27, a7K);
	    
	            Slot d28 = new Slot(5,28, NewWave);
	    
	            Slot d29 = new Slot(5,29, OSegredoAlemDoJardim);
	    
	            Slot d30 = new Slot(5,30, Ninja);
	    
	            Slot d31 = new Slot(5,31, Piloto);
	    
	            Slot d32 = new Slot(5,32, Pleasurekreft);
	    
	            Slot d33 = new Slot(5,33, California);
	    
	            Slot d34 = new Slot(5,34, AutumnRingMini);
	            
	            Slot d35 = new Slot(5,35, SuzukiEscudo);
	            
	            Slot d36 = new Slot(5,36, Autobahn);
	            
	            Slot d37 = new Slot(5,37, AkatsukiDeVila);
	                
	            Slot d38 = new Slot(5,38, JesusChorouPt2);
	        
	            Slot d39 = new Slot(5,39, SemSinal);
	            
	            Slot d40 = new Slot(5,40, RejeiteFalsosIcones);
	            
	            Slot d41 = new Slot(5,41, Vampiro);
	    
	            Slot d42 = new Slot(5,42, SemDo);
	    
	            Slot d43 = new Slot(5,43, Groupies);
	        
	            Slot d44 = new Slot(5,44, QuerVoar);
	
	            Slot d45 = new Slot(5,45, M4);
	    
	            Slot d46 = new Slot(5,46, Banco);
	            
	            Slot d47 = new Slot(5,47, AMorteDoAutotune);
	            
	            Slot d48 = new Slot(5,48, QuemMandaEA30);
	    
	            Slot d49 = new Slot(5,49, BalAzul);
	    
	            Slot d50 = new Slot(5,50, TavaBom);
	    
	            Slot d51 = new Slot(5,51, UmaBala);
	    
	            Slot d52 = new Slot(5,52, KennyG);
	    
	            Slot d53 = new Slot(5,53, a777666);
	    
	            Slot d54 = new Slot(5,54, Antes);
	    
	            Slot d55 = new Slot(5,55, ESal);
	    
	            Slot d56 = new Slot(5,56, MaquinaDoTempo);
	    
	            Slot d57 = new Slot(5,57, Cogulandia);
	    
	            Slot d58 = new Slot(5,58, Manha);
	    
	            Slot d59 = new Slot(5,59, DiaAzul);
	    
	            Slot d60 = new Slot(5,60, Fashion);
	            
	            Slot d61 = new Slot(5,61, ComeOn );         
	
	            Slot d62 = new Slot(5,62, RockNRoll );
	       
	            Slot d63 = new Slot(5,63, Location );
	            
	            Slot d64 = new Slot(5,64, AmericaTeen );
	           
	            Slot d65 = new Slot(5,65, Grenade );
	            
	            Slot d66 = new Slot(5,66, CountOnMe );
	    
	            Slot d67 = new Slot(5,67, MarryYou );
	               
	            Slot d68 = new Slot(5,68, Photograph );
	        
	            Slot d69 = new Slot(5,69, ShapeOfYou);
	
	            Slot d70 = new Slot(5,70, Perfect );
	            
	            Slot d71 = new Slot(5,71, LouisVMeninaLinda);
	            
	            Slot d72 = new Slot(5, 72, NaoMeSintoMAlMais);
	            
	            Slot d73 = new Slot(5,73, EstacionaEDesce);
	                
	            Slot d74 = new Slot(5,74, AiPreto);
	        
	            Slot d75 = new Slot(5,75, Perdicao);
	
	            Slot d76 = new Slot(5,76, SeiQueTuGostaMuito);
	            
	            Slot d77 = new Slot(5,77, Metflix);
	            
	            Slot d78 = new Slot(5,78, SenteAMarra);
	                
	            Slot d79 = new Slot(5,79, ACaraDocrime2);
	        
	            Slot d80 = new Slot(5,80, Congratulation);
	            
	            Slot d81 = new  Slot(5,81, LemonTree );
	    
	            Slot d82 = new Slot (5,82, Stay );
	                    
	            Slot d83 = new Slot (5,83, Circle );
	                       
	            Slot d84 = new Slot (5,84, CandyPaint );
	                        
	            Slot d85 = new Slot (5,85, Goodbyes);
	                        
	            Slot d86 = new Slot (5,86, Baby );
	                
	            Slot d87 = new Slot (5,87, OneTime );
	                            
	            Slot d88 = new Slot (5,88, Marquinha );
	                    
	            Slot d89 = new Slot (5,89, Silence );
	                        
	            Slot d90 = new Slot (5,90, Happier );
	            
	            Slot d91 = new Slot (5,91, Yellow );
	                            
	            Slot d92 = new  Slot (5,92, FixYou );
	                    
	            Slot  d93 = new  Slot (5 , 93 , VivaLaVida );
	                        
	            Slot  d94 = new  Slot (5 , 94 , LoveOfMine);
	                        
	            Slot  d95 = new  Slot (5 , 95 , Beliver );
	                        
	            Slot  d96 = new  Slot (5 , 96 , Birds );
	                
	            Slot  d97 = new  Slot (5 , 97 , Chanel );
	                            
	            Slot  d98 = new  Slot (5 , 98 , Nights );
	                    
	            Slot  d99 = new  Slot (5 , 99 , A505 );
	                
	            Slot d100 = new  Slot (5 , 100 , JaVirouRotina );
	            
	            Slot d101 = new Slot(5, 101, Agua);
	    
	            Slot d102 = new Slot(5, 102, OkBaby);
	    
	            Slot d103 = new Slot(5, 103, Rn);
	    
	            Slot d104 = new Slot(5, 104, Dejavu);
	    
	            Slot d105 = new Slot(5, 105, Osaka);
	    
	            Slot d106 = new Slot(5, 106, Kyoto);
	    
	            Slot d107 = new Slot(5, 107, DieForYou);
	    
	            Slot d108 = new Slot(5, 108, a2036);
	    
	            Slot d109 = new Slot(5, 109, High);
	    
	            Slot d110 = new Slot(5, 110, SpikeLee);
	    
	            Slot d112 = new Slot(5, 112, Yokono);
	            
	            Slot d111 = new Slot(5, 111, ComoEuTeQuero);
	    
	            Slot d113 = new Slot(5, 113, Salao);
	    
	            Slot d114 = new Slot(5, 114, QuemEQuem);
	    
	            Slot d115 = new Slot(5, 115, Prada);
	            
	            Slot d116 = new Slot(5, 116, POCPOC);
	            
	            Slot d117 = new Slot(5, 117, JackBauer);
	            
	            Slot d118 = new Slot(5, 118, Honda);
	    
	            Slot d119 = new Slot(5, 119, TT);
	    
	            Slot d120 = new Slot(5, 120, Rush);
	            
	            Slot d121 = new Slot(5, 121, Balenciaga);
	    
	            Slot d122 = new Slot(5, 122, LV);
	    
	            Slot d123 = new Slot(5, 123, Snakes);
	    
	            Slot d124 = new Slot(5, 124, Mob);
	    
	            Slot d125 = new Slot(5, 125, NovoRico);
	    
	            Slot d126 = new Slot(5, 126, Netflix);
	    
	            Slot d127 = new Slot(5, 127, Dinero);
	    
	            Slot d128 = new Slot(5, 128, VidaDeChafe);
	    
	            Slot d129 = new Slot(5, 129, TipoGiroflex);
	            
	            Slot d130 = new Slot(5, 130, OPretoMaiscaro);
	    
	            Slot d131 = new Slot(5,131, DoubleCup);
	                
	            Slot d132 = new Slot(5,132, Evoque);
	        
	            Slot d133 = new Slot(5,133, a212Vip);
	    
	            Slot d134 = new Slot(5, 134, Flash);
	    
	            Slot d135 = new Slot(5,135, Medina);
	    
	            Slot d136 = new Slot(5,136, TipoGTA);
	    
	            Slot d137 = new Slot(5,137, NaoPisaNoMeuBoot);
	        
	            Slot d138 = new Slot(5,138, OPaiTaOn);
	
	            Slot d139 = new Slot(5,139, SeSegura);
	            
	            Slot d140 = new Slot(5,140, VestidoDaFendi);
	
	            Slot d141 = new Slot(5,141, Licor43);
	                
	            Slot d142 = new Slot(5,142, Lembrancas);
	        
	            Slot d143 = new Slot(5, 143, Tralha);
	            
	            Slot d144 = new Slot(5,144, FogueteDaNasa);
	            
	            Slot d145 = new Slot(5,145, Freestyle);
	            
	            Slot d146 = new  Slot (5 , 146 , Brasa );
	                
	            Slot  d147 = new  Slot (5 , 147 , Lucidez );
	        
	            Slot  d148 = new  Slot (5 ,148 , Envolver );
	            
	            Slot  d149 = new  Slot (5 , 149 , LaLoto );
	            
	            Slot  d150 = new  Slot (5 , 150 , VersionofMe);
	            
	            Slot  d151 = new  Slot (5 , 151 , WaterlmelonSugar );
	    
	            Slot  d152 = new  Slot (5 , 152 , AtItWas );
	                
	            Slot  d153 = new  Slot (5 , 153 , Matilda );
	        
	            Slot  d154 = new  Slot (5 , 154 , BetterNow );
	
	            Slot  d155 = new  Slot (5 , 155 , Psycho );
	    
	            Slot  d156 = new  Slot (5 , 156 , Boyfriend );
	                
	            Slot  d157 = new  Slot (5 , 157 , Allergic );
	        
	            Slot  d158 = new  Slot (5 , 157 , SaintTropez );
	            
	            Slot  d159 = new  Slot (5 , 159 , Somebody );
	            
	            Slot  d160 = new  Slot (5 , 160 , Doutora3 );
	            
	            Slot  d161 = new  Slot (5 , 161 , CavaloDeTroia );
	    
	            Slot  d162 = new  Slot (5 , 162 , Cracolandia );
	                
	            Slot  d163 = new  Slot (5 , 163 , Sunflower );
	        
	            Slot  d164 = new  Slot (5 , 164 , internet );
	
	            Slot  d165 = new  Slot (5 , 165 , Enemies );
	
	            Slot  d166 = new  Slot (5 , 166 , NeverSayNever );
	    
	            Slot  d167 = new  Slot (5 , 167 , NoisTaBolandoUmPlano );
	    
	            Slot  d168 = new  Slot (5 , 168 , MacaVerde );
	        
	            Slot  d169 = new  Slot (5 , 169 , TiraDeGiro );
	
	            Slot  d170 = new  Slot (5 , 170 , MoBrisa );
	    
	            Slot  d171 = new  Slot (5 , 171 , PraTeVer );
	            
	            Slot  d172 = new  Slot (5 , 172 , LeiDoRetorno );
	            
	            Slot  d173 = new  Slot (5 , 173 , Obssessao );
	    
	            Slot  d174 = new  Slot (5 , 174 , QuemTemDo );
	    
	            Slot  d175 = new  Slot (5 , 175 , CoracaoNaGeladeira);
	            
	            Slot  d176 = new  Slot (5 , 176 , Ressaca );
	    
	            Slot  d177 = new  Slot (5 , 177 , LV );
	    
	            Slot  d178 = new  Slot (5 , 178 , JogaBola );
	    
	            Slot  d179 = new  Slot (5 , 179 , Clima );
	    
	            Slot  d180 = new  Slot (5 , 180 , Vencedores );
	    
	            Slot  d181 = new  Slot (5 , 181 , Bailao );
	    
	            Slot  d182 = new  Slot (5 , 182 , Cavalinho );
	    
	            Slot  d183 = new  Slot (5 , 183 , JaguarDoAno );
	    
	            Slot  d184 = new  Slot (5 , 184 , VidaDeArtista );
	    
	            Slot  d185 = new  Slot (5 , 185 , PassarDeFoguetao );
	            
	            Slot d186 = new Slot(5,186, DinheiroMeSonda);
	            
	            Slot d187 = new Slot(5, 187, Forbes);
	    
	            Slot d188 = new Slot(5,188, ElaRebolaPraMimeSenta);
	                
	            Slot d189 = new Slot(5,189, Marquinha);
	        
	            Slot d190 = new Slot(5, 190, MeninoBom);
	            
	            Slot d191 = new Slot(5,191, EuSoDeslizo);
	    
	            Slot d192 = new Slot(5,192, DripdeNegao);
	                
	            Slot d193 = new Slot(5,193, RockNRoll);
	        
	            Slot d194 = new Slot(5, 194, PretoRico);
	            
	            Slot d195 = new Slot(5,195, TranseiComAMorte);
	            
	            Slot d196 = new Slot(5,196, Cassino);
	            
	            Slot d197 = new Slot(5,197, SuaSafada);
	    
	            Slot d198 = new Slot(5,198, Oracao);
	                
	            Slot d199 = new Slot(5,199, Progresso);
	        
	            Slot d200 = new Slot(5,200, DizQueEHoje);
	            
	            Slot d201 = new Slot(5,201, Felina);
	                
	            Slot d202 = new Slot(5,202, Sertao);
	        
	            Slot d203 = new Slot(5,203, AmigaTalarica);
	            
	            Slot d204 = new Slot(5,204, Pitbull);
	    
	            Slot d205 = new Slot(5,205, LagrimasDecrocodilo);
	                
	            Slot d206 = new Slot(5,206, Obraz);
	        
	            Slot d207 = new Slot(5, 207, Mantem);
	            
	            Slot d208 = new Slot(5,208, Sucrilhos);
	            
	            Slot d209 = new Slot(5,209, OCaveiraoChegou);
	            
	            Slot d210 = new Slot(5,210, OMaestroDosFluxos);
	            
	            Slot d211 = new Slot(5,211, HinoDosParedoes);
	                
	            Slot d212 = new Slot(5,212, Liberdade);
	        
	            Slot d213 = new Slot(5, 213, MegaRaveSemChao);
	            
	            Slot d214 = new Slot(5,214, RaveDaSirene);
	
	            Slot d215 = new Slot(5,215, IrmaGostosa);
	            
	            Slot d216 = new Slot(5,216, FazerFalta);
	            
	            Slot d217 = new Slot(5,217, SenteAMarra);
	                
	            Slot d218 = new Slot(5,218, CalendarioDoPapai);
	        
	            Slot d219 = new Slot(5,219, ToGostandoTantoDeVoce);
	            
	            Slot d220 = new Slot(5, 220, Reputation);

				

 //================================================================
 // dia 8 
     
		         Slot g1 = new Slot(8,1, MiamiVice);
		 
		         Slot g2 = new Slot(8,2, Wave);
		             
		         Slot g3 = new Slot(8,3, Vlife);
		     
		         Slot g4 = new Slot(8, 4, Margiela);
		         
		         Slot g5 = new Slot(8,5, WaterWater);
		         
		         Slot g6 = new Slot(8,6, OnlyFans);
		         
		         Slot g7 = new Slot(8,7, Lilas);
		 
		         Slot g8 = new Slot(8,8, Highlights);
		             
		         Slot g9 = new Slot(8,9, a30Dias);
		     
		         Slot g10 = new Slot(8,10, RSS);
		 
		         Slot g11 = new Slot( 5,11, LuisaSonza);
		
		         Slot g12 = new Slot(8,12, ScoobyDoo);
		     
		         Slot g13 = new Slot(8,13, a360);
		         
		         Slot g14 = new Slot(8,14, ITOLDYOU);
		         
		         Slot g15 = new Slot(8,15, ForReal);
		         
		         Slot g16 = new Slot(8, 16, NoCap);
		 
		         Slot g17 = new Slot(8,17, FeFeFe);
		             
		         Slot g18 = new Slot(8,18, EuTenhoDrip);
		     
		         Slot g19 = new Slot(8,89, KylieJenner);
		         
		         Slot g20 = new Slot(8,20, PlayboyInternacional);
		 
		         Slot g21 = new Slot(8,21, Vilao);
		 
		         Slot g22 = new Slot(8,22, Monstro);
		 
		         Slot g23 = new Slot(8,23, HayabusaChromo);
		 
		         Slot g24 = new Slot(8,24, DriftDeYasuo);
		 
		         Slot g25 = new Slot(8,25, KatanaEPistola);
		 
		         Slot g26 = new Slot(8,26, RidersX);
		 
		         Slot g27 = new Slot(8,27, a7K);
		 
		         Slot g28 = new Slot(8,28, NewWave);
		 
		         Slot g29 = new Slot(8,29, OSegredoAlemDoJardim);
		 
		         Slot g30 = new Slot(8,30, Ninja);
		 
		         Slot g31 = new Slot(8,31, Piloto);
		 
		         Slot g32 = new Slot(8,32, Pleasurekreft);
		 
		         Slot g33 = new Slot(8,33, California);
		 
		         Slot g34 = new Slot(8,34, AutumnRingMini);
		         
		         Slot g35 = new Slot(8,35, SuzukiEscudo);
		         
		         Slot g36 = new Slot(8,36, Autobahn);
		         
		         Slot g37 = new Slot(8,37, AkatsukiDeVila);
		             
		         Slot g38 = new Slot(8,38, JesusChorouPt2);
		     
		         Slot g39 = new Slot(8,39, SemSinal);
		         
		         Slot g40 = new Slot(8,40, RejeiteFalsosIcones);
		         
		         Slot g41 = new Slot(8,41, Vampiro);
		 
		         Slot g42 = new Slot(8,42, SemDo);
		 
		         Slot g43 = new Slot(8,43, Groupies);
		     
		         Slot g44 = new Slot(8,44, QuerVoar);
		
		         Slot g45 = new Slot(8,45, M4);
		 
		         Slot g46 = new Slot(8,46, Banco);
		         
		         Slot g47 = new Slot(8,47, AMorteDoAutotune);
		         
		         Slot g48 = new Slot(8,48, QuemMandaEA30);
		 
		         Slot g49 = new Slot(8,49, BalAzul);
		 
		         Slot g50 = new Slot(8,50, TavaBom);
		 
		         Slot g51 = new Slot(8,51, UmaBala);
		 
		         Slot g52 = new Slot(8,52, KennyG);
		 
		         Slot g53 = new Slot(8,53, a777666);
		 
		         Slot g54 = new Slot(8,54, Antes);
		 
		         Slot g55 = new Slot(8,55, ESal);
		 
		         Slot g56 = new Slot(8,56, MaquinaDoTempo);
		 
		         Slot g57 = new Slot(8,57, Cogulandia);
		 
		         Slot g58 = new Slot(8,58, Manha);
		 
		         Slot g59 = new Slot(8,59, DiaAzul);
		 
		         Slot g60 = new Slot(8,60, Fashion);
		         
		         Slot g61 = new Slot(8,61, ComeOn );         
		
		         Slot g62 = new Slot(8,62, RockNRoll );
		    
		         Slot g63 = new Slot(8,63, Location );
		         
		         Slot g64 = new Slot(8,64, AmericaTeen );
		        
		         Slot g65 = new Slot(8,65, Grenade );
		         
		         Slot g66 = new Slot(8,66, CountOnMe );
		 
		         Slot g67 = new Slot(8,67, MarryYou );
		            
		         Slot g68 = new Slot(8,68, Photograph );
		     
		         Slot g69 = new Slot(8,69, ShapeOfYou);
		
		         Slot g70 = new Slot(8,70, Perfect );
		         
		         Slot g71 = new Slot(8,71, LouisVMeninaLinda);
		         
		         Slot g72 = new Slot(8, 72, NaoMeSintoMAlMais);
		         
		         Slot g73 = new Slot(8,73, EstacionaEDesce);
		             
		         Slot g74 = new Slot(8,74, AiPreto);
		     
		         Slot g75 = new Slot(8,75, Perdicao);
		
		         Slot g76 = new Slot(8,76, SeiQueTuGostaMuito);
		         
		         Slot g77 = new Slot(8,77, Metflix);
		         
		         Slot g78 = new Slot(8,78, SenteAMarra);
		             
		         Slot g79 = new Slot(8,79, ACaraDocrime2);
		     
		         Slot g80 = new Slot(8,80, Congratulation);
		         
		         Slot g81 = new  Slot(8,81, LemonTree );
		 
		         Slot g82 = new Slot (8,82, Stay );
		                 
		         Slot g83 = new Slot (8,83, Circle );
		                    
		         Slot g84 = new Slot (8,84, CandyPaint );
		                     
		         Slot g85 = new Slot (8,85, Goodbyes);
		                     
		         Slot g86 = new Slot (8,86, Baby );
		             
		         Slot g87 = new Slot (8,87, OneTime );
		                         
		         Slot g88 = new Slot (8,88, Marquinha );
		                 
		         Slot g89 = new Slot (8,89, Silence );
		                     
		         Slot g90 = new Slot (8,90, Happier );
		         
		         Slot g91 = new Slot (8,91, Yellow );
		                         
		         Slot g92 = new  Slot (8,92, FixYou );
		                 
		         Slot  g93 = new  Slot (8 , 93 , VivaLaVida );
		                     
		         Slot  g94 = new  Slot (8 , 94 , LoveOfMine);
		                     
		         Slot  g95 = new  Slot (8 , 95 , Beliver );
		                     
		         Slot  g96 = new  Slot (8 , 96 , Birds );
		             
		         Slot  g97 = new  Slot (8 , 97 , Chanel );
		                         
		         Slot  g98 = new  Slot (8 , 98 , Nights );
		                 
		         Slot  g99 = new  Slot (8 , 99 , A505 );
		             
		         Slot g100 = new  Slot (8 , 100 , JaVirouRotina );
		         
		         Slot g101 = new Slot(8, 101, Agua);
		 
		         Slot g102 = new Slot(8, 102, OkBaby);
		 
		         Slot g103 = new Slot(8, 103, Rn);
		 
		         Slot g104 = new Slot(8, 104, Dejavu);
		 
		         Slot g105 = new Slot(8, 105, Osaka);
		 
		         Slot g106 = new Slot(8, 106, Kyoto);
		 
		         Slot g107 = new Slot(8, 107, DieForYou);
		 
		         Slot g108 = new Slot(8, 108, a2036);
		 
		         Slot g109 = new Slot(8, 109, High);
		 
		         Slot g110 = new Slot(8, 110, SpikeLee);
		 
		         Slot g112 = new Slot(8, 112, Yokono);
		         
		         Slot g111 = new Slot(8, 111, ComoEuTeQuero);
		 
		         Slot g113 = new Slot(8, 113, Salao);
		 
		         Slot g114 = new Slot(8, 114, QuemEQuem);
		 
		         Slot g115 = new Slot(8, 115, Prada);
		         
		         Slot g116 = new Slot(8, 116, POCPOC);
		         
		         Slot g117 = new Slot(8, 117, JackBauer);
		         
		         Slot g118 = new Slot(8, 118, Honda);
		 
		         Slot g119 = new Slot(8, 119, TT);
		 
		         Slot g120 = new Slot(8, 120, Rush);
		         
		         Slot g121 = new Slot(8, 121, Balenciaga);
		 
		         Slot g122 = new Slot(8, 122, LV);
		 
		         Slot g123 = new Slot(8, 123, Snakes);
		 
		         Slot g124 = new Slot(8, 124, Mob);
		 
		         Slot g125 = new Slot(8, 125, NovoRico);
		 
		         Slot g126 = new Slot(8, 126, Netflix);
		 
		         Slot g127 = new Slot(8, 127, Dinero);
		 
		         Slot g128 = new Slot(8, 128, VidaDeChafe);
		 
		         Slot g129 = new Slot(8, 129, TipoGiroflex);
		         
		         Slot g130 = new Slot(8, 130, OPretoMaiscaro);
		 
		         Slot g131 = new Slot(8,131, DoubleCup);
		             
		         Slot g132 = new Slot(8,132, Evoque);
		     
		         Slot g133 = new Slot(8,133, a212Vip);
		 
		         Slot g134 = new Slot(8, 134, Flash);
		 
		         Slot g135 = new Slot(8,135, Medina);
		 
		         Slot g136 = new Slot(8,136, TipoGTA);
		 
		         Slot g137 = new Slot(8,137, NaoPisaNoMeuBoot);
		     
		         Slot g138 = new Slot(8,138, OPaiTaOn);
		
		         Slot g139 = new Slot(8,139, SeSegura);
		         
		         Slot g140 = new Slot(8,140, VestidoDaFendi);
		
		         Slot g141 = new Slot(8,141, Licor43);
		             
		         Slot g142 = new Slot(8,142, Lembrancas);
		     
		         Slot g143 = new Slot(8, 143, Tralha);
		         
		         Slot g144 = new Slot(8,144, FogueteDaNasa);
		         
		         Slot g145 = new Slot(8,145, Freestyle);
		         
		         Slot g146 = new  Slot (8 , 146 , Brasa );
		             
		         Slot  g147 = new  Slot (8 , 147 , Lucidez );
		     
		         Slot  g148 = new  Slot (8 ,148 , Envolver );
		         
		         Slot  g149 = new  Slot (8 , 149 , LaLoto );
		         
		         Slot  g150 = new  Slot (8 , 150 , VersionofMe);
		         
		         Slot  g151 = new  Slot (8 , 151 , WaterlmelonSugar );
		 
		         Slot  g152 = new  Slot (8 , 152 , AtItWas );
		             
		         Slot  g153 = new  Slot (8 , 153 , Matilda );
		     
		         Slot  g154 = new  Slot (8 , 154 , BetterNow );
		
		         Slot  g155 = new  Slot (8 , 155 , Psycho );
		 
		         Slot  g156 = new  Slot (8 , 156 , Boyfriend );
		             
		         Slot  g157 = new  Slot (8 , 157 , Allergic );
		     
		         Slot  g158 = new  Slot (8 , 157 , SaintTropez );
		         
		         Slot  g159 = new  Slot (8 , 159 , Somebody );
		         
		         Slot  g160 = new  Slot (8 , 160 , Doutora3 );
		         
		         Slot  g161 = new  Slot (8 , 161 , CavaloDeTroia );
		 
		         Slot  g162 = new  Slot (8 , 162 , Cracolandia );
		             
		         Slot  g163 = new  Slot (8 , 163 , Sunflower );
		     
		         Slot  g164 = new  Slot (8 , 164 , internet );
		
		         Slot  g165 = new  Slot (8 , 165 , Enemies );
		
		         Slot  g166 = new  Slot (8 , 166 , NeverSayNever );
		 
		         Slot  g167 = new  Slot (8 , 167 , NoisTaBolandoUmPlano );
		 
		         Slot  g168 = new  Slot (8 , 168 , MacaVerde );
		     
		         Slot  g169 = new  Slot (8 , 169 , TiraDeGiro );
		
		         Slot  g170 = new  Slot (8 , 170 , MoBrisa );
		 
		         Slot  g171 = new  Slot (8 , 171 , PraTeVer );
		         
		         Slot  g172 = new  Slot (8 , 172 , LeiDoRetorno );
		         
		         Slot  g173 = new  Slot (8 , 173 , Obssessao );
		 
		         Slot  g174 = new  Slot (8 , 174 , QuemTemDo );
		 
		         Slot  g175 = new  Slot (8 , 175 , CoracaoNaGeladeira);
		         
		         Slot  g176 = new  Slot (8 , 176 , Ressaca );
		 
		         Slot  g177 = new  Slot (8 , 177 , LV );
		 
		         Slot  g178 = new  Slot (8 , 178 , JogaBola );
		 
		         Slot  g179 = new  Slot (8 , 179 , Clima );
		 
		         Slot  g180 = new  Slot (8 , 180 , Vencedores );
		 
		         Slot  g181 = new  Slot (8 , 181 , Bailao );
		 
		         Slot  g182 = new  Slot (8 , 182 , Cavalinho );
		 
		         Slot  g183 = new  Slot (8 , 183 , JaguarDoAno );
		 
		         Slot  g184 = new  Slot (8 , 184 , VidaDeArtista );
		 
		         Slot  g185 = new  Slot (8 , 185 , PassarDeFoguetao );
		         
		         Slot g186 = new Slot(8,186, DinheiroMeSonda);
		         
		         Slot g187 = new Slot(8, 187, Forbes);
		 
		         Slot g188 = new Slot(8,188, ElaRebolaPraMimeSenta);
		             
		         Slot g189 = new Slot(8,189, Marquinha);
		     
		         Slot g190 = new Slot(8, 190, MeninoBom);
		         
		         Slot g191 = new Slot(8,191, EuSoDeslizo);
		 
		         Slot g192 = new Slot(8,192, DripdeNegao);
		             
		         Slot g193 = new Slot(8,193, RockNRoll);
		     
		         Slot g194 = new Slot(8, 194, PretoRico);
		         
		         Slot g195 = new Slot(8,195, TranseiComAMorte);
		         
		         Slot g196 = new Slot(8,196, Cassino);
		         
		         Slot g197 = new Slot(8,197, SuaSafada);
		 
		         Slot g198 = new Slot(8,198, Oracao);
		             
		         Slot g199 = new Slot(8,199, Progresso);
		     
		         Slot g200 = new Slot(8,200, DizQueEHoje);
		         
		         Slot g201 = new Slot(8,201, Felina);
		             
		         Slot g202 = new Slot(8,202, Sertao);
		     
		         Slot g203 = new Slot(8,203, AmigaTalarica);
		         
		         Slot g204 = new Slot(8,204, Pitbull);
		 
		         Slot g205 = new Slot(8,205, LagrimasDecrocodilo);
		             
		         Slot g206 = new Slot(8,206, Obraz);
		     
		         Slot g207 = new Slot(8, 207, Mantem);
		         
		         Slot g208 = new Slot(8,208, Sucrilhos);
		         
		         Slot g209 = new Slot(8,209, OCaveiraoChegou);
		         
		         Slot g210 = new Slot(8,210, OMaestroDosFluxos);
		         
		         Slot g211 = new Slot(8,211, HinoDosParedoes);
		             
		         Slot g212 = new Slot(8,212, Liberdade);
		     
		         Slot g213 = new Slot(8, 213, MegaRaveSemChao);
		         
		         Slot g214 = new Slot(8,214, RaveDaSirene);
		
		         Slot g215 = new Slot(8,215, IrmaGostosa);
		         
		         Slot g216 = new Slot(8,216, FazerFalta);
		         
		         Slot g217 = new Slot(8,217, SenteAMarra);
		             
		         Slot g218 = new Slot(8,218, CalendarioDoPapai);
		     
		         Slot g219 = new Slot(8,219, ToGostandoTantoDeVoce);
		         
		         Slot g220 = new Slot(8, 220, Reputation);
		         
		         
		         
		         
		         
		         
//================================================================
// dia 11 
		         
		        Slot  j1 = new  Slot ( 11 , 1 , Congratulations );
		         
                Slot  j2 = new  Slot ( 11 , 2 , M4 );
                    
                Slot  j3 = new  Slot ( 11 , 3 , Goodbyes );
            
                Slot  j4 = new  Slot ( 11 , 4 , Stay );
                
                Slot  j5 = new  Slot ( 11 , 5 , Baby );
                
                Slot  j6 = new  Slot ( 11 , 6 , OneTime );
                
                Slot  j7 = new  Slot ( 11 , 7 , MoBrisa );
        
                Slot  j8 = new  Slot ( 11 , 8 , CavaloDeTroia );
                    
                Slot  j9 = new  Slot ( 11 , 9 , Doutora3 );
            
                Slot  j10 = new  Slot ( 11 , 10 , CandyPaint );
        
                Slot  j11 = new  Slot ( 11 , 11 , Envolver );
    
                Slot  j12 = new  Slot ( 11 , 12 , LemonTree );
            
                Slot  j13 = new  Slot ( 11 , 13 , Cracolandia );
                
                Slot  j14 = new  Slot ( 11 , 14 , MacaVerde );
                
                Slot  j15 = new  Slot ( 11 , 15 , Somebody );
                
                Slot  j16 = new  Slot ( 11 , 16 , Sunflower );
        
                Slot  j17 = new  Slot ( 11 , 17 , internet );
                    
                Slot  j18 = new  Slot ( 11 , 18 , Enemies );
            
                Slot  j19 = new  Slot ( 11 , 19 , NeverSayNever );
                
                Slot  j20 = new  Slot ( 11 , 20 , NoisTaBolandoUmPlano );
        
                Slot  j21 = new  Slot ( 11 , 21 , Yellow );
        
                Slot  j22 = new  Slot ( 11 , 22 , FixYou );
        
                Slot  j23 = new  Slot ( 11 , 23 , MarryYou);
        
                Slot  j24 = new  Slot ( 11 , 24 , Better );
        
                Slot  j25 = new  Slot ( 11 , 25 , AmericaTeen);
        
                Slot  j26 = new  Slot ( 11 , 26 , Location );
        
                Slot  j27 = new  Slot ( 11 , 27 , Peaches );
        
                Slot  j28 = new  Slot ( 11 , 28 , Boyfriend );
        
                Slot  j29 = new  Slot ( 11 , 29 , LouisVMeninaLinda );
        
                Slot  j30 = new  Slot ( 11 , 30 , OCaveiraoChegou );
        
                Slot  j31 = new  Slot ( 11 , 31 , Piloto );
        
                Slot  j32 = new  Slot ( 11 , 32 , AiPreto );
        
                Slot  j33 = new  Slot ( 11 , 33 , Circles );
        
                Slot  j34 = new  Slot ( 11 , 34 , Silence );
                
                Slot  j35 = new  Slot ( 11 , 35 , Photograph );
                
                Slot  j36 = new  Slot ( 11 , 36 , ShapeOfYou );
                
                Slot  j37 = new  Slot ( 11 , 37 , JaVirouRotina );
                    
                Slot  j38 = new  Slot ( 11 , 38 , ComoEuTeQuero);
            
                Slot  j39 = new  Slot ( 11 , 39 , Perdicao );
                
                Slot  j40 = new  Slot ( 11 , 40 , OMaestroDosFluxos );
                
                Slot  j41 = new  Slot ( 11 , 41 , SemDo );
        
                Slot  j42 = new  Slot ( 11 , 42 , Felina );
        
                Slot  j43 = new  Slot ( 11 , 43 , Groupies );
            
                Slot  j44 = new  Slot ( 11 , 44 , AMorteDoAutotune );
    
                Slot  j45 = new  Slot ( 11 , 45 , DinheiroMeSonda );
        
                Slot  j46 = new  Slot ( 11 , 46 , LuisaSonza );
                
                Slot  j47 = new  Slot ( 11 , 47 , ScoobyDoo );
                
                Slot  j48 = new  Slot ( 11 , 48 , VestidoDaFendi );
        
                Slot  j49 = new  Slot ( 11 , 49 , TipoGTA );
        
                Slot  j50 = new  Slot ( 11 , 50 , CalendarioDoPapai );
        
                Slot  j51 = new  Slot ( 11 , 51 , Happier );
        
                Slot  j52 = new  Slot ( 11 , 52 , ComeOn );
        
                Slot  j53 = new  Slot ( 11 , 53 , PassarDeFoguetao);
        
                Slot  j54 = new  Slot ( 11 , 54 , Honda );
        
                Slot  j55 = new  Slot ( 11 , 55 , Netflix );
        
                Slot  j56 = new  Slot ( 11 , 56 , Rush );
        
                Slot  j57 = new  Slot ( 11 , 57 , Metflix );
        
                Slot  j58 = new  Slot ( 11 , 58 , ACaraDocrime2);
        
                Slot  j59 = new  Slot ( 11 , 59 , a7K );
        
                Slot  j60 = new  Slot ( 11 , 60 , NaoMeSintoMAlMais);
                
		        Slot  j61 = new  Slot ( 11 , 61 , Grenade );         
	
		        Slot  j62 = new  Slot ( 11 , 62 , RockNRoll );
		           
		        Slot  j63 = new  Slot ( 11 , 63 , VivaLaVida );
		                
		        Slot  j64 = new  Slot ( 11 , 64 , LoveOfMine );
		               
		        Slot  j65 = new  Slot ( 11 , 65 , A505 );
		                
		        Slot  j66 = new  Slot ( 11 , 66 , LaLoto );
		        
		        Slot  j67 = new  Slot ( 11 , 67 , TiraDeGiro );
		                   
		        Slot  j68 = new  Slot ( 11 , 68 , AtItWas );
		            
		        Slot  j69 = new  Slot ( 11 , 69 , Vencedores );
	
		        Slot  j70 = new  Slot ( 11 , 70 , ComoEuTeQuero);
                
                Slot  j71 = new  Slot ( 11 , 71 , Cogulandia);
                
                Slot  j72 = new  Slot ( 11 , 72 , Fashion );
                
                Slot  j73 = new  Slot ( 11 , 73 , Prada );
                    
                Slot  j74 = new  Slot ( 11 , 74 , MegaRaveSemChao );
            
                Slot  j75 = new  Slot ( 11 , 75 , FazerFalta );

                Slot  j76 = new  Slot ( 11 , 76 , ToGostandoTantoDeVoce );
                
                Slot  j77 = new  Slot ( 11 , 77 , ElaRebolaPraMimeSenta);
                
                Slot  j78 = new  Slot ( 11 , 78 , RockNRoll );
                    
                Slot  j79 = new  Slot ( 11 , 79 , DizQueEHoje);
            
                Slot  j80 = new  Slot ( 11 , 80 , Highlights);
                
                Slot  j81 = new   Slot ( 11 , 81 , a360 );
        
                Slot  j82 = new  Slot ( 11 , 82 , Licor43 );

                Slot  j83 = new  Slot ( 11 , 83 , a212Vip );

                Slot  j84 = new  Slot ( 11 , 84 , NaoPisaNoMeuBoot );

                Slot  j85 = new  Slot ( 11 , 85 , TT );

                Slot  j86 = new  Slot ( 11 , 86 , Vampiro );

                Slot  j87 = new  Slot ( 11 , 87 , TavaBom );

                Slot  j88 = new  Slot ( 11 , 88 , ESal);

                Slot  j89 = new  Slot ( 11 , 89 , DieForYou );

                Slot  j90 = new  Slot ( 11 , 90 , RaveDaSirene );

                Slot  j91 = new  Slot ( 11 , 91 , IrmaGostosa );

                Slot  j92 = new   Slot ( 11 , 92 , SenteAMarra );

                Slot   j93 = new   Slot ( 11 , 93 , LagrimasDecrocodilo);

                Slot   j94 = new   Slot ( 11 , 94 , Sucrilhos );

                Slot   j95 = new   Slot ( 11 , 95 , Mantem );

                Slot   j96 = new   Slot ( 11 , 96 , Marquinha );

                Slot   j97 = new   Slot ( 11 , 97 , PretoRico );

                Slot   j98 = new   Slot ( 11 , 98 , DizQueEHoje);

                Slot   j99 = new   Slot ( 11 , 99 , a30Dias );

                Slot  j100 = new   Slot ( 11 , 100 , BlackMoney );

                Slot  j101 = new  Slot ( 11 , 101 , BetterNow );
        
                Slot  j102 = new  Slot ( 11 , 102 , Brasa );
        
                Slot  j103 = new  Slot ( 11 , 103 , Lucidez );
        
                Slot  j104 = new  Slot ( 11 , 104 , KylieJenner );
        
                Slot  j105 = new  Slot ( 11 , 105 , Lembrancas );
        
                Slot  j106 = new  Slot ( 11 , 106 , DoubleCup );
        
                Slot  j107 = new  Slot ( 11 , 107 , Flash );
        
                Slot  j108 = new  Slot ( 11 , 108 , Medina );
        
                Slot  j109 = new  Slot ( 11 , 109 , LV );
        
                Slot  j110 = new  Slot ( 11 , 110 , Dinero );
        
                Slot  j112 = new  Slot ( 11 , 112 , Vilao );
                
                Slot  j111 = new  Slot ( 11 , 111 , RidersX);
        
                Slot  j113 = new  Slot ( 11 , 113 , California );
        
                Slot  j114 = new  Slot ( 11 , 114 , SemSinal );
        
                Slot  j115 = new  Slot ( 11 , 115 , EstacionaEDesce);
                
                Slot  j116 = new  Slot ( 11 , 116 , Beliver );
                
                Slot  j117 = new  Slot ( 11 , 117 , Matilda );
                
                Slot  j118 = new  Slot ( 11 , 118 , PraTeVer );
        
                Slot  j119 = new  Slot ( 11 , 119 , Bailao );
        
                Slot  j120 = new  Slot ( 11 , 120 , QuemMandaEA30 );
                
                Slot  j121 = new  Slot ( 11 , 121 , a777666 );
        
                Slot  j122 = new  Slot ( 11 , 122 , KennyG );
        
                Slot  j123 = new  Slot ( 11 , 123 , Agua );
        
                Slot  j124 = new  Slot ( 11 , 124 , OkBaby );
        
                Slot  j125 = new  Slot ( 11 , 125 , High );
        
                Slot  j126 = new  Slot ( 11 , 126 , QuemEQuem );
        
                Slot  j127 = new  Slot ( 11 , 127 , Reputation );
        
                Slot  j128 = new  Slot ( 11 , 128 , Sertao );
        
                Slot  j129 = new  Slot ( 11 , 129 , TiraDeGiro );
                
                Slot  j130 = new  Slot ( 11 , 130 , Obraz );
        
                Slot  j131 = new  Slot ( 11 , 131 , MeninoBom );
                    
                Slot  j132 = new  Slot ( 11 , 132 , Oracao );
            
                Slot  j133 = new  Slot ( 11 , 133 , Wave );
        
                Slot  j134 = new  Slot ( 11 , 134 , OnlyFans );
        
                Slot  j135 = new  Slot ( 11 , 135 , ForReal );
        
                Slot  j136 = new  Slot ( 11 , 136 , EuTenhoDrip );
        
                Slot  j137 = new  Slot ( 11 , 137 , VestidoDaFendi );
            
                Slot  j138 = new  Slot ( 11 , 138 , Evoque);
    
                Slot  j139 = new  Slot ( 11 , 139 , SeSegura);
                
                Slot  j140 = new  Slot ( 11 , 140 , Balenciaga);
    
                Slot  j141 = new  Slot ( 11 , 141 , Snakes);
                    
                Slot  j142 = new  Slot ( 11 , 142 , Mob);
            
                Slot  j143 = new  Slot ( 11 , 143 , VidaDeChafe);
                
                Slot  j144 = new  Slot ( 11 , 144 , PlayboyInternacional);
                
                Slot  j145 = new  Slot ( 11 , 145 , Monstro);
                
                Slot  j146 = new   Slot ( 11 , 146 , HayabusaChromo);
                    
                Slot   j147 = new   Slot ( 11 , 147 , KatanaEPistola );
            
                Slot   j148 = new   Slot ( 11 , 148 , NewWave );
                
                Slot   j149 = new   Slot ( 11 , 149 , Piloto);
                
                Slot   j150 = new   Slot ( 11 , 150 , AutumnRingMini);
                
                Slot   j151 = new   Slot ( 11 , 151 , LeiDoRetorno );
        
                Slot   j152 = new   Slot ( 11 , 152 , Obssessao );
                    
                Slot   j153 = new   Slot ( 11 , 153 , JogaBola );
            
                Slot   j154 = new   Slot ( 11 , 154 , Cavalinho );

                Slot   j155 = new   Slot ( 11 , 155 , WaterlmelonSugar );
        
                Slot   j156 = new   Slot ( 11 , 156 , Perfect );
                    
                Slot   j157 = new   Slot ( 11 , 157 , ACaraDocrime2);
            
                Slot   j158 = new   Slot ( 11 , 157 , RejeiteFalsosIcones);
                
                Slot   j159 = new   Slot ( 11 , 159 , Autobahn );
                
                Slot   j160 = new   Slot ( 11 , 160 , Ninja );
                
                Slot   j161 = new   Slot ( 11 , 161 , JackBauer );
        
                Slot   j162 = new   Slot ( 11 , 162 , SeSegura );
                    
                Slot   j163 = new   Slot ( 11 , 163 , OPaiTaOn );
            
                Slot   j164 = new   Slot ( 11 , 164 , Freestyle );

                Slot   j165 = new   Slot ( 11 , 165 , FogueteDaNasa);

                Slot   j166 = new   Slot ( 11 , 166 , RSS );
        
                Slot   j167 = new   Slot ( 11 , 167 , Vlife );
        
                Slot   j168 = new   Slot ( 11 , 168 , DizQueEHoje );
            
                Slot   j169 = new   Slot ( 11 , 169 , EuSoDeslizo );
    
                Slot   j170 = new   Slot ( 11 , 170 , Pitbull );
        
                Slot   j171 = new   Slot ( 11 , 171 , Salao );
                
                Slot   j172 = new   Slot ( 11 , 172 , SenteAMarra );
                
                Slot   j173 = new   Slot ( 11 , 173 , Liberdade );
        
                Slot   j174 = new   Slot ( 11 , 174 , QuemTemDo );
        
                Slot   j175 = new   Slot ( 11 , 175 , SpikeLee );
                
                Slot   j176 = new   Slot ( 11 , 176 , Kyoto );
        
                Slot   j177 = new   Slot ( 11 , 177 , OkBaby );
        
                Slot   j178 = new   Slot ( 11 , 178 , DiaAzul );
        
                Slot   j179 = new   Slot ( 11 , 179 , MaquinaDoTempo );
        
                Slot   j180 = new   Slot ( 11 , 180 , ESal);
        
                Slot   j181 = new   Slot ( 11 , 181 , UmaBala );
        
                Slot   j182 = new   Slot ( 11 , 182 , Banco );
        
                Slot   j183 = new   Slot ( 11 , 183 , QuerVoar );
        
                Slot   j184 = new   Slot ( 11 , 184 , M4 );
        
                Slot   j185 = new   Slot ( 11 , 185 , Manha );
                
                Slot  j186 = new  Slot ( 11 , 186 , Rn );
                
                Slot  j187 = new  Slot ( 11 , 187 , a2036 );
        
                Slot  j188 = new  Slot ( 11 , 188 , Yokono );
                    
                Slot  j189 = new  Slot ( 11 , 189 , HinoDosParedoes );
            
                Slot  j190 = new  Slot ( 11 , 190 , Felina );
                
                Slot  j191 = new  Slot ( 11 , 191 , Mantem );
        
                Slot  j192 = new  Slot ( 11 , 192 , Forbes );
                    
                Slot  j193 = new  Slot ( 11 , 193 , Cassino );
            
                Slot  j194 = new  Slot ( 11 , 194 , TranseiComAMorte );
                
                Slot  j195 = new  Slot ( 11 , 195 , SuaSafada );
                
                Slot  j196 = new  Slot ( 11 , 196 , Progresso );
                
                Slot  j197 = new  Slot ( 11 , 197 , DizQueEHoje);
        
                Slot  j198 = new  Slot ( 11 , 198 , Margiela );
                    
                Slot  j199 = new  Slot ( 11 , 199 , WaterWater );
            
                Slot  j200 = new  Slot ( 11 , 200 , Lilas );
                
                Slot  j201 = new  Slot ( 11 , 201 , a30Dias );
                    
                Slot  j202 = new  Slot ( 11 , 202 , ITOLDYOU);
            
                Slot  j203 = new  Slot ( 11 , 203 , FeFeFe );
                
                Slot  j204 = new  Slot ( 11 , 204 , Lembrancas );
        
                Slot  j205 = new  Slot ( 11 , 205 , Tralha );
                    
                Slot  j206 = new  Slot ( 11 , 206 , OPretoMaiscaro);
            
                Slot  j207 = new  Slot ( 11 , 207 , a212Vip );
                
                Slot  j208 = new  Slot ( 11 , 208 , POCPOC );
                
                Slot  j209 = new  Slot ( 11 , 209 , NovoRico );
                
                Slot  j210 = new  Slot ( 11 , 210 , TipoGiroflex);
                
                Slot  j211 = new  Slot ( 11 , 211 , DriftDeYasuo);
                    
                Slot  j212 = new  Slot ( 11 , 212 , a7K );
            
                Slot  j213 = new  Slot ( 11 , 213 , OSegredoAlemDoJardim );
                
                Slot  j214 = new  Slot ( 11 , 214 , Pleasurekreft );

                Slot  j215 = new  Slot ( 11 , 215 , SuzukiEscudo );
                
                Slot  j216 = new  Slot ( 11 , 216 , California);
                
                Slot  j217 = new  Slot ( 11 , 217 , AkatsukiDeVila );
                    
                Slot  j218 = new  Slot ( 11 , 218 , JesusChorouPt2 );
            
                Slot  j219 = new  Slot ( 11 , 219 , RejeiteFalsosIcones);
                
                Slot  j220 = new  Slot ( 11 , 220 , CountOnMe);

		      
		         
		         
	            
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
		radio.inserir(s141);
		radio.inserir(s142);
		radio.inserir(s143);
		radio.inserir(s144);
		radio.inserir(s145);
		radio.inserir(s146);
		radio.inserir(s147);
		radio.inserir(s148);
		radio.inserir(s149);
		radio.inserir(s150);
		radio.inserir(s151);
		radio.inserir(s152);
		radio.inserir(s153);
		radio.inserir(s154);
		radio.inserir(s155);
		radio.inserir(s156);
		radio.inserir(s157);
		radio.inserir(s158);
		radio.inserir(s159);
		radio.inserir(s160);
		radio.inserir(s161);
		radio.inserir(s162);
		radio.inserir(s163);
		radio.inserir(s164);
		radio.inserir(s165);
		radio.inserir(s166);
		radio.inserir(s167);
		radio.inserir(s168);
		radio.inserir(s169);
		radio.inserir(s170);
		radio.inserir(s171);
		radio.inserir(s172);
		radio.inserir(s173);
		radio.inserir(s174);
		radio.inserir(s175);
		radio.inserir(s176);
		radio.inserir(s177);
		radio.inserir(s178);
		radio.inserir(s179);
		radio.inserir(s180);
		radio.inserir(s191);
		radio.inserir(s192);
		radio.inserir(s193);
		radio.inserir(s194);
		radio.inserir(s195);
		radio.inserir(s196);
		radio.inserir(s197);
		radio.inserir(s198);
		radio.inserir(s199);
		radio.inserir(s200);
		radio.inserir(s201);
		radio.inserir(s202);
		radio.inserir(s203);
		radio.inserir(s204);
		radio.inserir(s205);
		radio.inserir(s206);
		radio.inserir(s207);
		radio.inserir(s208);
		radio.inserir(s209);
		radio.inserir(s210);
		radio.inserir(s211);
		radio.inserir(s212);
		radio.inserir(s213);
		radio.inserir(s214);
		radio.inserir(s215);
		radio.inserir(s216);
		radio.inserir(s217);
		radio.inserir(s218);
		radio.inserir(s219);
		radio.inserir(s220);
		
		
		
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
		radio.inserir(a20);
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
		radio.inserir(a101);
		radio.inserir(a102);
		radio.inserir(a103);
		radio.inserir(a104);
		radio.inserir(a105);
		radio.inserir(a106);
		radio.inserir(a107);
		radio.inserir(a108);
		radio.inserir(a109);
		radio.inserir(a110);
		radio.inserir(a111);
		radio.inserir(a112);
		radio.inserir(a113);
		radio.inserir(a114);
		radio.inserir(a115);
		radio.inserir(a116);
		radio.inserir(a117);
		radio.inserir(a118);
		radio.inserir(a119);
		radio.inserir(a120);
		radio.inserir(a121);
		radio.inserir(a122);
		radio.inserir(a123);
		radio.inserir(a124);
		radio.inserir(a125);
		radio.inserir(a126);
		radio.inserir(a127);
		radio.inserir(a128);
		radio.inserir(a129);
		radio.inserir(a130);
		radio.inserir(a131);
		radio.inserir(a132);
		radio.inserir(a133);
		radio.inserir(a134);
		radio.inserir(a135);
		radio.inserir(a136);
		radio.inserir(a137);
		radio.inserir(a138);
		radio.inserir(a139);
		radio.inserir(a140);
		radio.inserir(a141);
		radio.inserir(a142);
		radio.inserir(a143);
		radio.inserir(a144);
		radio.inserir(a145);
		radio.inserir(a146);
		radio.inserir(a147);
		radio.inserir(a148);
		radio.inserir(a149);
		radio.inserir(a150);
		radio.inserir(a151);
		radio.inserir(a152);
		radio.inserir(a153);
		radio.inserir(a154);
		radio.inserir(a155);
		radio.inserir(a156);
		radio.inserir(a157);
		radio.inserir(a158);
		radio.inserir(a159);
		radio.inserir(a160);
		radio.inserir(a161);
		radio.inserir(a162);
		radio.inserir(a163);
		radio.inserir(a164);
		radio.inserir(a165);
		radio.inserir(a166);
		radio.inserir(a167);
		radio.inserir(a168);
		radio.inserir(a169);
		radio.inserir(a170);
		radio.inserir(a171);
		radio.inserir(a172);
		radio.inserir(a173);
		radio.inserir(a174);
		radio.inserir(a175);
		radio.inserir(a176);
		radio.inserir(a177);
		radio.inserir(a178);
		radio.inserir(a179);
		radio.inserir(a180);
		radio.inserir(a191);
		radio.inserir(a192);
		radio.inserir(a193);
		radio.inserir(a194);
		radio.inserir(a195);
		radio.inserir(a196);
		radio.inserir(a197);
		radio.inserir(a198);
		radio.inserir(a199);
		radio.inserir(a200);
		radio.inserir(a201);
		radio.inserir(a202);
		radio.inserir(a203);
		radio.inserir(a204);
		radio.inserir(a205);
		radio.inserir(a206);
		radio.inserir(a207);
		radio.inserir(a208);
		radio.inserir(a209);
		radio.inserir(a210);
		radio.inserir(a211);
		radio.inserir(a212);
		radio.inserir(a213);
		radio.inserir(a214);
		radio.inserir(a215);
		radio.inserir(a216);
		radio.inserir(a217);
		radio.inserir(a218);
		radio.inserir(a219);
		radio.inserir(a220);
		
		
		
//================================================================
// inserindo dia 5 
        
        
        radio.inserir(d1);
        radio.inserir(d2);
        radio.inserir(d3);
        radio.inserir(d4);
        radio.inserir(d5);
        radio.inserir(d6);
        radio.inserir(d7);
        radio.inserir(d8);
        radio.inserir(d9);
        radio.inserir(d10);
        radio.inserir(d11);
        radio.inserir(d12);
        radio.inserir(d13);
        radio.inserir(d14);
        radio.inserir(d15);
        radio.inserir(d16);
        radio.inserir(d17);
        radio.inserir(d18);
        radio.inserir(d19);
        radio.inserir(d20);
        radio.inserir(d21);
        radio.inserir(d22);
        radio.inserir(d23);
        radio.inserir(d24);
        radio.inserir(d25);
        radio.inserir(d26);
        radio.inserir(d27);
        radio.inserir(d28);
        radio.inserir(d29);
        radio.inserir(d30);
        radio.inserir(d31);
        radio.inserir(d32);
        radio.inserir(d33);
        radio.inserir(d34);
        radio.inserir(d35);
        radio.inserir(d36);
        radio.inserir(d37);
        radio.inserir(d38);
        radio.inserir(d39);
        radio.inserir(d40);
        radio.inserir(d41);
        radio.inserir(d42);
        radio.inserir(d43);
        radio.inserir(d44);
        radio.inserir(d45);
        radio.inserir(d46);
        radio.inserir(d47);
        radio.inserir(d48);
        radio.inserir(d49);
        radio.inserir(d50);
        radio.inserir(d51);
        radio.inserir(d52);
        radio.inserir(d53);
        radio.inserir(d54);
        radio.inserir(d55);
        radio.inserir(d56);
        radio.inserir(d57);
        radio.inserir(d58);
        radio.inserir(d59);
        radio.inserir(d60);
        radio.inserir(d61);
        radio.inserir(d62);
        radio.inserir(d63);
        radio.inserir(d64);
        radio.inserir(d65);
        radio.inserir(d66);
        radio.inserir(d67);
        radio.inserir(d68);
        radio.inserir(d69);
        radio.inserir(d70);
        radio.inserir(d71);
        radio.inserir(d72);
        radio.inserir(d73);
        radio.inserir(d74);
        radio.inserir(d75);
        radio.inserir(d76);
        radio.inserir(d77);
        radio.inserir(d78);
        radio.inserir(d79);
        radio.inserir(d80);
        radio.inserir(d81);
        radio.inserir(d82);
        radio.inserir(d83);
        radio.inserir(d84);
        radio.inserir(d85);
        radio.inserir(d86);
        radio.inserir(d87);
        radio.inserir(d88);
        radio.inserir(d89);
        radio.inserir(d90);
        radio.inserir(d91);
        radio.inserir(d92);
        radio.inserir(d93);
        radio.inserir(d94);
        radio.inserir(d95);
        radio.inserir(d96);
        radio.inserir(d97);
        radio.inserir(d98);
        radio.inserir(d99);
        radio.inserir(d100);
        radio.inserir(d101);
        radio.inserir(d102);
        radio.inserir(d103);
        radio.inserir(d104);
        radio.inserir(d105);
        radio.inserir(d106);
        radio.inserir(d107);
        radio.inserir(d108);
        radio.inserir(d109);
        radio.inserir(d110);
        radio.inserir(d111);
        radio.inserir(d112);
        radio.inserir(d113);
        radio.inserir(d114);
        radio.inserir(d115);
        radio.inserir(d116);
        radio.inserir(d117);
        radio.inserir(d118);
        radio.inserir(d119);
        radio.inserir(d120);
        radio.inserir(d121);
        radio.inserir(d122);
        radio.inserir(d123);
        radio.inserir(d124);
        radio.inserir(d125);
        radio.inserir(d126);
        radio.inserir(d127);
        radio.inserir(d128);
        radio.inserir(d129);
        radio.inserir(d130);
        radio.inserir(d131);
        radio.inserir(d132);
        radio.inserir(d133);
        radio.inserir(d134);
        radio.inserir(d135);
        radio.inserir(d136);
        radio.inserir(d137);
        radio.inserir(d138);
        radio.inserir(d139);
        radio.inserir(d140);
        radio.inserir(d141);
        radio.inserir(d142);
        radio.inserir(d143);
        radio.inserir(d144);
        radio.inserir(d145);
        radio.inserir(d146);
        radio.inserir(d147);
        radio.inserir(d148);
        radio.inserir(d149);
        radio.inserir(d150);
        radio.inserir(d151);
        radio.inserir(d152);
        radio.inserir(d153);
        radio.inserir(d154);
        radio.inserir(d155);
        radio.inserir(d156);
        radio.inserir(d157);
        radio.inserir(d158);
        radio.inserir(d159);
        radio.inserir(d160);
        radio.inserir(d161);
        radio.inserir(d162);
        radio.inserir(d163);
        radio.inserir(d164);
        radio.inserir(d165);
        radio.inserir(d166);
        radio.inserir(d167);
        radio.inserir(d168);
        radio.inserir(d169);
        radio.inserir(d170);
        radio.inserir(d171);
        radio.inserir(d172);
        radio.inserir(d173);
        radio.inserir(d174);
        radio.inserir(d175);
        radio.inserir(d176);
        radio.inserir(d177);
        radio.inserir(d178);
        radio.inserir(d179);
        radio.inserir(d180);
        radio.inserir(d191);
        radio.inserir(d192);
        radio.inserir(d193);
        radio.inserir(d194);
        radio.inserir(d195);
        radio.inserir(d196);
        radio.inserir(d197);
        radio.inserir(d198);
        radio.inserir(d199);
        radio.inserir(d200);
        radio.inserir(d201);
        radio.inserir(d202);
        radio.inserir(d203);
        radio.inserir(d204);
        radio.inserir(d205);
        radio.inserir(d206);
        radio.inserir(d207);
        radio.inserir(d208);
        radio.inserir(d209);
        radio.inserir(d210);
        radio.inserir(d211);
        radio.inserir(d212);
        radio.inserir(d213);
        radio.inserir(d214);
        radio.inserir(d215);
        radio.inserir(d216);
        radio.inserir(d217);
        radio.inserir(d218);
        radio.inserir(d219);
        radio.inserir(d220);
        
        

 //================================================================
 // inserindo dia 8 
 
 
		 radio.inserir(g1);
		 radio.inserir(g2);
		 radio.inserir(g3);
		 radio.inserir(g4);
		 radio.inserir(g5);
		 radio.inserir(g6);
		 radio.inserir(g7);
		 radio.inserir(g8);
		 radio.inserir(g9);
		 radio.inserir(g10);
		 radio.inserir(g11);
		 radio.inserir(g12);
		 radio.inserir(g13);
		 radio.inserir(g14);
		 radio.inserir(g15);
		 radio.inserir(g16);
		 radio.inserir(g17);
		 radio.inserir(g18);
		 radio.inserir(g19);
		 radio.inserir(g20);
		 radio.inserir(g21);
		 radio.inserir(g22);
		 radio.inserir(g23);
		 radio.inserir(g24);
		 radio.inserir(g25);
		 radio.inserir(g26);
		 radio.inserir(g27);
		 radio.inserir(g28);
		 radio.inserir(g29);
		 radio.inserir(g30);
		 radio.inserir(g31);
		 radio.inserir(g32);
		 radio.inserir(g33);
		 radio.inserir(g34);
		 radio.inserir(g35);
		 radio.inserir(g36);
		 radio.inserir(g37);
		 radio.inserir(g38);
		 radio.inserir(g39);
		 radio.inserir(g40);
		 radio.inserir(g41);
		 radio.inserir(g42);
		 radio.inserir(g43);
		 radio.inserir(g44);
		 radio.inserir(g45);
		 radio.inserir(g46);
		 radio.inserir(g47);
		 radio.inserir(g48);
		 radio.inserir(g49);
		 radio.inserir(g50);
		 radio.inserir(g51);
		 radio.inserir(g52);
		 radio.inserir(g53);
		 radio.inserir(g54);
		 radio.inserir(g55);
		 radio.inserir(g56);
		 radio.inserir(g57);
		 radio.inserir(g58);
		 radio.inserir(g59);
		 radio.inserir(g60);
		 radio.inserir(g61);
		 radio.inserir(g62);
		 radio.inserir(g63);
		 radio.inserir(g64);
		 radio.inserir(g65);
		 radio.inserir(g66);
		 radio.inserir(g67);
		 radio.inserir(g68);
		 radio.inserir(g69);
		 radio.inserir(g70);
		 radio.inserir(g71);
		 radio.inserir(g72);
		 radio.inserir(g73);
		 radio.inserir(g74);
		 radio.inserir(g75);
		 radio.inserir(g76);
		 radio.inserir(g77);
		 radio.inserir(g78);
		 radio.inserir(g79);
		 radio.inserir(g80);
		 radio.inserir(g81);
		 radio.inserir(g82);
		 radio.inserir(g83);
		 radio.inserir(g84);
		 radio.inserir(g85);
		 radio.inserir(g86);
		 radio.inserir(g87);
		 radio.inserir(g88);
		 radio.inserir(g89);
		 radio.inserir(g90);
		 radio.inserir(g91);
		 radio.inserir(g92);
		 radio.inserir(g93);
		 radio.inserir(g94);
		 radio.inserir(g95);
		 radio.inserir(g96);
		 radio.inserir(g97);
		 radio.inserir(g98);
		 radio.inserir(g99);
		 radio.inserir(g100);
		 radio.inserir(g101);
		 radio.inserir(g102);
		 radio.inserir(g103);
		 radio.inserir(g104);
		 radio.inserir(g105);
		 radio.inserir(g106);
		 radio.inserir(g107);
		 radio.inserir(g108);
		 radio.inserir(g109);
		 radio.inserir(g110);
		 radio.inserir(g111);
		 radio.inserir(g112);
		 radio.inserir(g113);
		 radio.inserir(g114);
		 radio.inserir(g115);
		 radio.inserir(g116);
		 radio.inserir(g117);
		 radio.inserir(g118);
		 radio.inserir(g119);
		 radio.inserir(g120);
		 radio.inserir(g121);
		 radio.inserir(g122);
		 radio.inserir(g123);
		 radio.inserir(g124);
		 radio.inserir(g125);
		 radio.inserir(g126);
		 radio.inserir(g127);
		 radio.inserir(g128);
		 radio.inserir(g129);
		 radio.inserir(g130);
		 radio.inserir(g131);
		 radio.inserir(g132);
		 radio.inserir(g133);
		 radio.inserir(g134);
		 radio.inserir(g135);
		 radio.inserir(g136);
		 radio.inserir(g137);
		 radio.inserir(g138);
		 radio.inserir(g139);
		 radio.inserir(g140);
		 radio.inserir(g141);
		 radio.inserir(g142);
		 radio.inserir(g143);
		 radio.inserir(g144);
		 radio.inserir(g145);
		 radio.inserir(g146);
		 radio.inserir(g147);
		 radio.inserir(g148);
		 radio.inserir(g149);
		 radio.inserir(g150);
		 radio.inserir(g151);
		 radio.inserir(g152);
		 radio.inserir(g153);
		 radio.inserir(g154);
		 radio.inserir(g155);
		 radio.inserir(g156);
		 radio.inserir(g157);
		 radio.inserir(g158);
		 radio.inserir(g159);
		 radio.inserir(g160);
		 radio.inserir(g161);
		 radio.inserir(g162);
		 radio.inserir(g163);
		 radio.inserir(g164);
		 radio.inserir(g165);
		 radio.inserir(g166);
		 radio.inserir(g167);
		 radio.inserir(g168);
		 radio.inserir(g169);
		 radio.inserir(g170);
		 radio.inserir(g171);
		 radio.inserir(g172);
		 radio.inserir(g173);
		 radio.inserir(g174);
		 radio.inserir(g175);
		 radio.inserir(g176);
		 radio.inserir(g177);
		 radio.inserir(g178);
		 radio.inserir(g179);
		 radio.inserir(g180);
		 radio.inserir(g191);
		 radio.inserir(g192);
		 radio.inserir(g193);
		 radio.inserir(g194);
		 radio.inserir(g195);
		 radio.inserir(g196);
		 radio.inserir(g197);
		 radio.inserir(g198);
		 radio.inserir(g199);
		 radio.inserir(g200);
		 radio.inserir(g201);
		 radio.inserir(g202);
		 radio.inserir(g203);
		 radio.inserir(g204);
		 radio.inserir(g205);
		 radio.inserir(g206);
		 radio.inserir(g207);
		 radio.inserir(g208);
		 radio.inserir(g209);
		 radio.inserir(g210);
		 radio.inserir(g211);
		 radio.inserir(g212);
		 radio.inserir(g213);
		 radio.inserir(g214);
		 radio.inserir(g215);
		 radio.inserir(g216);
		 radio.inserir(g217);
		 radio.inserir(g218);
		 radio.inserir(g219);
		 radio.inserir(g220);
		
//================================================================
		
		System.out.println(s1.dscrição());
		System.out.println(s2.dscrição());
		System.out.println(s3.dscrição());
		System.out.println(s4.dscrição());
		System.out.println(s5.dscrição());
		
		System.out.println("===============================================");
		System.out.println("\nSegue a Lista de Musicas do dia");
		System.out.println("\n===============================================");
		
		
		radio.buscarDia(8);
		System.out.println(radio.getQuantidade());
	
		
		
	
		
	}
}
