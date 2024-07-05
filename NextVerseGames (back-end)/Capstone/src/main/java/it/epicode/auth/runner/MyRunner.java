package it.epicode.auth.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import it.epicode.auth.configuration.VideogiocoConfig;
import it.epicode.auth.entity.Categoria;
import it.epicode.auth.entity.Videogioco;
import it.epicode.auth.service.VideogiocoService;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	VideogiocoConfig config;
	@Autowired
	VideogiocoService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Creo videogiochi

		Videogioco Tears_of_the_Kingdom= config.creaVideogioco("Tears of The Kingdom",
				"https://wallpapercave.com/wp/wp12278094.jpg", Categoria.RPG,
				"Nintendo", "Nintendo", LocalDate.of(2023, 5, 12), 59.99, "The incredible masterpiece of Nintendo return in a majestic open-world that improves and refines every aspect of its predecessor!");

		Videogioco Doom_Eternal = config.creaVideogioco("Doom Eternal",
				"https://wallpapercave.com/wp/wp5248400.jpg", Categoria.FPS,
				"Bethesda Softworks", "id Software", LocalDate.of(2020, 4, 16), 39.99, "Experience the ultimate combination of speed and power in DOOM Eternal - the next leap in push-forward, first-person combat.Hell’s armies have invaded Earth. Become the Slayer in an epic single-player campaign to conquer demons across dimensions and stop the final destruction of humanity.");
		
		Videogioco Monster_Hunter_Rise_Sunbreak_Deluxe_Edition = config.creaVideogioco("Monster Hunter Rise Sunbreak-Deluxe Edition",
				"https://cdn.nexus.gg/assets/vidya/55f668d48da146e598d006e4f64ac540/images/screenshots/21f948bf353481fe00270c0ebdfeb012", Categoria.AZIONE, "CAPCOM Co., Ltd.",
				"CAPCOM Co., Ltd.", LocalDate.of(2022, 6, 30), 39.99, "This fantastic installment in the legendary saga will introduce Malzeno, a menacing new flagship monster, as well as other new monsters like the lupine Fanged Wyvern Lunagaron, the towering Garangolm, and new subspecies such as Blood Orange Bishaten. Hunters will also encounter numerous fan-favorite and returning species from previous Monster Hunter games including the voltaic Astalos.");
		
		Videogioco Elden_Ring = config.creaVideogioco("Elden Ring",
				"https://fond-decran.com/wp-content/uploads/2022/04/elden-ring-wallpaper.jpg", Categoria.RPG,
				"Bandai Namco Entertainment", "FromSoftware", LocalDate.of(2022, 02, 25), 49.99, "Unparalleled adventure awaits in ELDEN RING, the next epic fantasy title created by FromSoftware, Inc. and BANDAI NAMCO Entertainment Inc. ELDEN RING is FromSoftware's largest game to-date and is set in a sprawling realm steeped in a rich and bloody history crafted by Hidetaka Miyazaki - creator of the influential and critically acclaimed DARK SOULS video game series; and George R.R. Martin - author of The New York Times best-selling fantasy series, A Song of Ice and Fire.");
		
		Videogioco Super_Mario_Odyssey = config.creaVideogioco("Super Mario Odyssey",
				"https://greatgamer.ru/images/games_cover/cover_35155.jpg", Categoria.AZIONE, "Nintendo",
				"Nintendo EPD", LocalDate.of(2017, 10, 27), 49.99, "Explore 3D kingdoms filled with secrets and surprises, including costumes for Mario and several ways to interact with environments. Mario's new friend, Cappy, lets you master new moves like cap throw, cap jump and capture. Visit astonishing new locales, such as the skyscraper-packed New Donk City, and run into familiar friends and foes as you try to save Princess Peach from Bowser's clutches and foil his dastardly wedding plans");
		
		Videogioco Forza_Horizon_5 = config.creaVideogioco("Forza Horizon 5",
				"https://traxion.gg/wp-content/uploads/2021/08/Forza-Horizon-5-game-cover.jpg", Categoria.SPORT,
				"Xbox Game Studios", "Playground Games", LocalDate.of(2021, 11, 9), 59.99, "Lead breathtaking expeditions across the vibrant and ever-evolving open world landscapes of Mexico with limitless, fun driving action in hundreds of the world’s greatest cars. Explore a world of striking contrast and beauty. Discover living deserts, lush jungles, historic cities, hidden ruins, pristine beaches, vast canyons, and a towering snow-capped volcano.");
		
		Videogioco Bayonetta_3 = config.creaVideogioco("Bayonetta 3",
				"https://pressakey.com/gamepix/5313/Bayonetta-3-271699.jpg", Categoria.AZIONE,
				"Nintendo", "Platinum Games", LocalDate.of(2022, 10, 28), 59.99, "Play as the bewitching Bayonetta in the third installment of her climax action game series. Shoot, stomp, and slam your way through multiple locations and meet other Bayonettas");
		
		Videogioco Tetris_Effect_Connected = config.creaVideogioco("Tetris Effect:Connected",
				"https://www.gamingtalker.it/wp-content/uploads/2020/12/Tetris_Effect_Connected_Xbox_KeyArt_1080p.jpg", Categoria.ROMPICAPO, "Enhance",
				"Monstars Inc., Resonair, Stage Games", LocalDate.of(2021, 8, 18), 29.99, "Over 30 different stages, each with its own music, sound effects, graphical style and background that all evolve and change as you play through them. An exhilarating single-player experience full of surprises. A wide variety of competitive and co-op modes");

		Videogioco Outer_Wilds = config.creaVideogioco("Outer Wilds",
				"https://drive.google.com/u/0/uc?id=1ihX2NbsYCzaJCnPqllHyG_pUaeND6TxC", Categoria.NARRATIVO,
				"Annapurna", "Mobius Digital", LocalDate.of(2020, 6, 18), 22.99, "Titolo dell'anno 2019 per Giant Bomb, Polygon, Eurogamer e The Guardian, l'acclamato Outer Wilds è un gioco open world ambientato in un sistema solare intrappolato in un anello temporale senza fine.");
		
		Videogioco Octopath_Traveler_II = config.creaVideogioco("Octopath Traveler II",
				"https://i0.wp.com/waytoomany.games/wp-content/uploads/2023/03/Octopath-Traveler-2-Cover-Image.jpg?fit=1920%2C1080&ssl=1", Categoria.RPG,
				"Square Enix", "Square Enix, ACQUIRE Corp.", LocalDate.of(2023, 2, 24), 59.99, "Begin your adventure as one of eight new travelers, each with their own origins, motivations, and unique skills. The series’ HD-2D graphics, a fusion of retro pixel art and 3DCG, have reached even greater heights. The story takes place in Solistia, where diverse cultures thrive from east to west and the industries of the new era flourish; You can sail the seas and explore every corner of a world that changes from day to night");
		
		Videogioco Hogwarts_Legacy = config.creaVideogioco("Hogwarts Legacy",
				"https://wallpaperaccess.com/full/4649029.png", Categoria.RPG,
				"Warner Bros. Games", "Avalanche Software ", LocalDate.of(2023, 2, 10), 49.99, "EXPERIENCE A NEW WIZARDING WORLD ADVENTURE. Experience the wizarding world in an unexplored era to uncover a hidden truth from its past. Battle against trolls, Dark Wizards, goblins, and more as you face a dangerous villain threatening the fate of the wizarding world.");
		
		Videogioco We_Were_Here_Forever = config.creaVideogioco("We were here forever",
				"https://drive.google.com/u/0/uc?id=1foRKGhy1DWE0CDKUlDPSWkTIrpPPM8m9", Categoria.ROMPICAPO,
				"Total Mayhem Games", "Total Mayhem Games", LocalDate.of(2022, 5, 10), 17.99, "Ti risvegli imprigionato all'interno del sinistro Castle Rock: sei stato tradito o semplicemente non sei stato astuto? Scoprilo nella nuova avventura rompicapo coop della serie We Were Here! Riuscirai ad affrontare le oscure forze di questo regno o rimarrai intrappolato... per sempre?");
		
		Videogioco Dorf_Romantik = config.creaVideogioco("Dorf Romantik",
				"https://drive.google.com/u/0/uc?id=1vIB7UUuIIHYVIM6yy_Nmjw83qPgc6TlY", Categoria.ROMPICAPO,
				"Toukana Interactive", "Toukana Interactive", LocalDate.of(2022, 4, 28), 12.99, "Dorfromantik è un tranquillo gioco di costruzioni in cui si piazzano tegole esagonali per creare un paesaggio di villaggio in continua crescita. Esplora una varietà di biomi colorati, sblocca nuovi componenti e completa le missioni per dare vita al tuo mondo di gioco!");
		
		Videogioco Escape_Simulator = config.creaVideogioco("Escape Simulator",
				"https://drive.google.com/u/0/uc?id=1OqxHostTEvkQX9RHpiG_vYZye2dDzyGg", Categoria.ROMPICAPO,
				"Pine Studio", "Pine Studio", LocalDate.of(2021, 10,19), 14.99, "Rompicapo in prima persona che puoi giocare da solo o in co-op online (2-3 giocatori consigliati). Esplora una serie di escape room altamente interattive. Sposta mobili, raccogli ed esamina di tutto, spacca vasi e rompi serrature! Supporta le stanze comunità tramite l'editor di livelli.");
		
		Videogioco Ratchet_And_Clank_Rift_Apart = config.creaVideogioco("Ratchet and Clank: Rift Apart",
				"https://www.mkaugaming.com/wp-content/uploads/2021/06/2021-06-14_00300.jpg", Categoria.AZIONE,
				"PlayStation Publishing LLC", "Insomniac Games, Nixxes Software", LocalDate.of(2021, 6,11), 49.99, "Blast your way through an interdimensional adventure with Ratchet and Clank! Help them take on an evil emperor from another reality as you jump between action-packed worlds and beyond at hyper-speed!");
		
		Videogioco Inscryption = config.creaVideogioco("Inscryption",
				"https://wallpaperaccess.com/full/9517496.jpg", Categoria.ROMPICAPO,
				"Devolver Digital", "Daniel Mullins Games", LocalDate.of(2021, 10,19), 19.99, "Inscryption is a dark and disturbing card-based odyssey that blends the deckbuilding roguelike, escape-room style puzzles, and psychological horror into a blood-laced smoothie.");
		
		Videogioco The_Talos_principle_2 = config.creaVideogioco("The Talos Principle 2",
				"https://cdn2.unrealengine.com/talos-principle-2-1920x1080-bf093184b2dd.jpg", Categoria.ROMPICAPO,
				"Devolver Digital", "Croteam", LocalDate.of(2023, 11,2), 28.99, "A New Generation of Puzzles: Solve a wide array of puzzles with varying difficulty levels, including clever metapuzzles and highly challenging Gold puzzles. Finish the game without solving every puzzle, or pursue the rewards of complete mastery. A variety of new abilities, such as gravity manipulation and mind transference, join the established mechanics of the original Talos Principle, creating a fresh but familiar experience.");
		
		Videogioco The_Witcher_3_Wild_Hunt = config.creaVideogioco("The Witcher 3 - Wild Hunt",
				"https://gtxhdgamer.net/wp-content/uploads/2015/01/wallpaper_16_1920x1080_en.jpg", Categoria.RPG,
				"CD PROJEKT RED", "CD PROJEKT RED", LocalDate.of(2015, 5,18), 29.99, "Vesti i panni di Geralt di Rivia, cacciatore di mostri, in una terra devastata dalla guerra e infestata da terribili creature. Il tuo contratto? Rintracciare Ciri, la Figlia della Profezia, un'arma vivente che può alterare il destino del mondo.");
		
		Videogioco Dark_Souls_3 = config.creaVideogioco("Dark Souls 3",
				"https://cdn.suwalls.com/wallpapers/games/knight-on-fire-in-dark-souls-iii-53199-1920x1080.jpg", Categoria.RPG,
				"Bandai Namco", "FromSoftware", LocalDate.of(2016, 4,11), 24.99, "Dark Souls III continues to push the boundaries with the latest chapter in the critically-acclaimed and genre-defining series from director Hidetaka Miyazaki. Players will be immersed into a world of epic atmosphere and darkness with colossal enemies, expansive environments, and challenging and intense gameplay combat. As fires fade and the world falls into ruin, prepare yourself once more to Embrace The Darkness!");
		
		Videogioco Dredge = config.creaVideogioco("Dredge",
				"https://th.bing.com/th/id/R.dbb7cccbec71a747942813a14b16a074?rik=lfjzuRxGBwzlLA&riu=http%3a%2f%2fm.gettywallpapers.com%2fwp-content%2fuploads%2f2023%2f04%2fDredge-Game-Wallpaper.jpg&ehk=dTR%2bLf1ECFqB6CHrqExZ2uHtXk8elp8g7dkOi1Hr9bE%3d&risl=&pid=ImgRaw&r=0", Categoria.RPG,
				"Team17", "Black Salt Games", LocalDate.of(2023, 3,30), 24.99, "DREDGE is a single-player fishing adventure with a sinister undercurrent. Sell your catch, upgrade your boat, and dredge the depths for long-buried secrets. Explore a mysterious archipelago and discover why some things are best left forgotten.");

		Videogioco Total_War_Warhammer_3 = config.creaVideogioco("Total War: WARHAMMER III",
				"https://greatgamer.ru/images/games_cover/cover_35155.jpg", Categoria.STRATEGIA, "SEGA",
				"Creative Assembly", LocalDate.of(2022, 2, 22), 59.99, "Total War: Warhammer III (TWW3, WH3) is the third and final game in the Total War: Warhammer series, being developed by Creative Assembly. It is the sequel to Total War: Warhammer and Total War: Warhammer II, and the culmination of the series which is set in the Warhammer Fantasy universe created by Games Workshop.");

		Videogioco Pokemon_Emerald = config.creaVideogioco("Pokémon Emerald",
				"https://wallpapers.video/wp-content/uploads/2023/01/rayquaza-between-clouds-wallpaper-estatico.jpg", Categoria.RPG,
				"Nintendo", "Game Freak", LocalDate.of(2004, 9,16), 11.99, "Revive the epic cultimation of the third generation of Pokémon games! Pokémon emerald will immerse you in a chaotic and interesting region of Hoenn, where three ancient deities are fighting over the control of the weather of the entire world. ");

		Videogioco Boltgun = config.creaVideogioco("Warhammer: 40000 Boltgun",
				"https://th.bing.com/th/id/R.dbb7cccbec71a747942813a14b16a074?rik=lfjzuRxGBwzlLA&riu=http%3a%2f%2fm.gettywallpapers.com%2fwp-content%2fuploads%2f2023%2f04%2fDredge-Game-Wallpaper.jpg&ehk=dTR%2bLf1ECFqB6CHrqExZ2uHtXk8elp8g7dkOi1Hr9bE%3d&risl=&pid=ImgRaw&r=0", Categoria.FPS,
				"Focus Entertainment", "Auroch Digital", LocalDate.of(2023, 5, 23), 21.99, "Load up your Boltgun and unleash the awesome Space Marine arsenal to blast your way through an explosion of sprites, pixels and blood in a perfect blend of Warhammer 40,000, frenetic gameplay and the stylish visuals of 90’s retro shooters.");

		Videogioco Hunt_Showdown = config.creaVideogioco("Hunt Showdown",
				"https://wallpaperaccess.com/full/2806437.jpg", Categoria.FPS,
				"Crytek", "Crytek", LocalDate.of(2019, 8, 27), 39.99, "Hunt: Showdown is a high-stakes, tactical PvPvE first-person shooter. Hunt for bounties in the infested Bayou, kill nightmarish monsters and outwit competing hunters - alone or in a group - with your glory, gear, and gold on the line.");

		Videogioco Xenoblade_Chronicles_Definitive_Edition= config.creaVideogioco("Xenoblade Chronicles: Definitive Edition",
				"https://drive.google.com/u/0/uc?id=1V7EsTYN7j6sUvLH3cGJXZTfiRVCByaBh", Categoria.NARRATIVO,
				"Nintendo", "Monolith Soft", LocalDate.of(2020, 5, 29), 49.99, "The ultimate edition of the incredible masterpiece made by Monolith Soft. Experience the full force of this story-driven jrpg that has shaked the genre by its core, providing incredible characters and plot twists. Discover all the mysteries of the incredible world of Bionis, this stunning adveture is waiting for you.");

		Videogioco Apex_Legends = config.creaVideogioco("Apex Legends",
				"https://drive.google.com/u/0/uc?id=1ZmA009swt7scBIURvJPnP-Q5wkMPRPCa", Categoria.FPS,
				"Electronic Arts", "Respawn Entertainment", LocalDate.of(2020, 11, 5), 0.00, "Apex Legends è il pluripremiato battle royale gratuito sviluppato da Respawn Entertainment. Scopri un elenco in continua espansione di personaggi leggendari dotati di potenti abilità, scegli la strategia perfetta per la tua squadra e lasciati sorprendere da un gameplay innovativo.");

		Videogioco Day_Z = config.creaVideogioco("Day Z",
				"https://drive.google.com/u/0/uc?id=1RN4F6XZGSKccs_9n8tKOl22_fDFlxegK", Categoria.FPS,
				"Bohemia Interactive", "Bohemia Interactive", LocalDate.of(2018, 12, 13), 39.99, "Quanto sopravviverai in un mondo post-apocalittico invaso da zombi infetti, lottando contro altri sopravvissuti per risorse limitate? Farai squadra con giocatori sconosciuti e vi darete man forte? Oppure sarai un lupo solitario per evitare colpi bassi? Questo è DayZ. Questa è la tua storia.");


		// Salvo nel db
		if (service.findAll().size() == 0) {
			service.addVideogioco(Tears_of_the_Kingdom);
			service.addVideogioco(Doom_Eternal);
			service.addVideogioco(Monster_Hunter_Rise_Sunbreak_Deluxe_Edition);
			service.addVideogioco(Elden_Ring);
			service.addVideogioco(Super_Mario_Odyssey);
			service.addVideogioco(Forza_Horizon_5);
			service.addVideogioco(Bayonetta_3);
			service.addVideogioco(Tetris_Effect_Connected);
			service.addVideogioco(Outer_Wilds);
			service.addVideogioco(Octopath_Traveler_II);
			service.addVideogioco(Hogwarts_Legacy);
			service.addVideogioco(We_Were_Here_Forever);
			service.addVideogioco(Dorf_Romantik);
			service.addVideogioco(Escape_Simulator);
			service.addVideogioco(Ratchet_And_Clank_Rift_Apart);
			service.addVideogioco(Inscryption);
			service.addVideogioco(The_Talos_principle_2);
			service.addVideogioco(The_Witcher_3_Wild_Hunt);
			service.addVideogioco(Dark_Souls_3);
			service.addVideogioco(Dredge);
			service.addVideogioco(Total_War_Warhammer_3);
			service.addVideogioco(Pokemon_Emerald);
			service.addVideogioco(Boltgun);
			service.addVideogioco(Hunt_Showdown);
			service.addVideogioco(Xenoblade_Chronicles_Definitive_Edition);
			service.addVideogioco(Apex_Legends);
			service.addVideogioco(Day_Z);
			
		}

	}

}
