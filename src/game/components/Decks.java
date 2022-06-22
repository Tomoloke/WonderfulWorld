package game.components;

import java.util.ArrayList;
import java.util.List;

public class Decks {
	
	public List<Card> listCards;
	public List<Faction> listFactions;
	
	public Decks() {
		listCards = new ArrayList<Card>();
		listFactions = new ArrayList<Faction>();
		
		listCards.add(new Card("transmutation.png", "VVVAA", 'D', 'V', "R", "DDD", 'X', 1, 'X'));
		listCards.add(new Card("transportation_network.png", "BBB", 'B', 'B', "X", "X", 'X', 1, 'N'));
		listCards.add(new Card("transportation_network.png", "BBB", 'B', 'B', "X", "X", 'X', 1, 'N'));
		listCards.add(new Card("treasure_of_the_templars.png", "AAAAA", 'D', 'A', "RR", "DD", 'X', 3, 'X'));
		listCards.add(new Card("underground_city.png", "BBBDDD", 'N', 'D', "R", "BBNN", 'X', 3, 'X'));
		listCards.add(new Card("underground_city.png", "BBBDDD", 'N', 'D', "R", "BBNN", 'X', 3, 'X'));
		listCards.add(new Card("underwater_city.png", "NNVDD", 'A', 'D', "X", "VAA", 'X', 3, 'X'));
		listCards.add(new Card("underwater_city.png", "NNVDD", 'A', 'D', "X", "VAA", 'X', 3, 'X'));
		listCards.add(new Card("universal_exposition.png", "DDDFF", 'D', 'D', "X", "X", 'X', 3, 'V'));
		listCards.add(new Card("universal_vaccine.png", "VVV", 'D', 'V', "X", "X", 'X', 1, 'D'));
		listCards.add(new Card("university.png", "VDD", 'V', 'D', "X", "V", 'D', 2, 'X'));
		listCards.add(new Card("unknown_technology.png", "VVVVVVVR", 'V', 'V', "X", "X", 'X', 3, 'V'));
		listCards.add(new Card("virtual_reality.png", "VVVVV", 'D', 'V', "X", "D", 'V', 2, 'X'));
		listCards.add(new Card("airborne_laboratory.png", "NNN", 'V', 'N', "X", "VA", 'X', 0, 'X'));
		listCards.add(new Card("airborne_laboratory.png", "NNN", 'V', 'N', "X", "VA", 'X', 0, 'X'));
		listCards.add(new Card("airborne_laboratory.png", "NNN", 'V', 'N', "X", "VA", 'X', 0, 'X'));
		listCards.add(new Card("aircraft_carrier.png", "BBBNNNN", 'B', 'N', "GG", "A", 'N', 0, 'X'));
		listCards.add(new Card("alexanders_tomb.png", "AAAAAAA", 'D', 'A', "GG", "X", 'X', 10, 'X'));
		listCards.add(new Card("ancient_astronauts.png", "AAAAAAG", 'V', 'A', "RR", "V", 'A', 10, 'X'));
		listCards.add(new Card("aquaculture.png", "VVVVDD", 'V', 'V', "F", "X", 'X', 1, 'F'));
		listCards.add(new Card("ark_of_the_covenant.png", "AAAA", 'A', 'A', "R", "X", 'X', 5, 'X'));
		listCards.add(new Card("atlantis.png", "AAAAAAAR", 'D', 'A', "X", "X", 'X', 2, 'G'));
		listCards.add(new Card("bionic_grafts.png", "VVVVV", 'B', 'V', "G", "BB", 'X', 4, 'X'));
		listCards.add(new Card("blackbeards_treasure.png", "AAA", 'D', 'A', "X", "DA", 'X', 2, 'X'));
		listCards.add(new Card("casino_city.png", "NNNDDDD", 'D', 'D', "F", "DD", 'X', 1, 'F'));
		listCards.add(new Card("casino_city.png", "NNNDDDD", 'D', 'D', "F", "DD", 'X', 1, 'F'));
		listCards.add(new Card("center_of_the_earth.png", "AAAAAGG", 'A', 'A', "X", "X", 'X', 15, 'X'));
		listCards.add(new Card("cities_of_gold.png", "AAAA", 'D', 'A', "X", "DDD", 'X', 3, 'X'));
		listCards.add(new Card("city_of_agartha.png", "AAAAR", 'A', 'A', "X", "AA", 'X', 1, 'G'));
		listCards.add(new Card("climate_control.png", "VVVVV", 'N', 'V', "X", "NND", 'X', 2, 'X'));
		listCards.add(new Card("cryopreservation.png", "VVVVVVV", 'D', 'V', "F", "X", 'X', 1, 'F'));
		listCards.add(new Card("espionage_agency.png", "NNDD", 'A', 'D', "X", "AA", 'X', 1, 'X'));
		listCards.add(new Card("espionage_agency.png", "NNDD", 'A', 'D', "X", "AA", 'X', 1, 'X'));
		listCards.add(new Card("financial_center.png", "BBBBN", 'D', 'B', "F", "DD", 'X', 0, 'X'));
		listCards.add(new Card("financial_center.png", "BBBBN", 'D', 'B', "F", "DD", 'X', 0, 'X'));
		listCards.add(new Card("financial_center.png", "BBBBN", 'D', 'B', "F", "DD", 'X', 0, 'X'));
		listCards.add(new Card("financial_center.png", "BBBBN", 'D', 'B', "F", "DD", 'X', 0, 'X'));
		listCards.add(new Card("financial_center.png", "BBBBN", 'D', 'B', "F", "DD", 'X', 0, 'X'));
		listCards.add(new Card("fountain_of_youth.png", "AAAAAAA", 'N', 'A', "RRR", "X", 'X', 1, 'G'));
		listCards.add(new Card("garden_of_the_hesperides.png", "AAAAA", 'A', 'A', "X", "X", 'X', 2, 'D'));
		listCards.add(new Card("genetic_upgrades.png", "VVVV", 'V', 'V', "FF", "X", 'X', 3, 'X'));
		listCards.add(new Card("giant_dam.png", "BBBDD", 'N', 'D', "X", "NNNN", 'X', 1, 'X'));
		listCards.add(new Card("giant_tower.png", "BBDDDF", 'D', 'D', "X", "X", 'X', 10, 'X'));
		listCards.add(new Card("gravity_inverter.png", "NVVVVR", 'V', 'V', "F", "X", 'X', 2, 'D'));
		listCards.add(new Card("harbor_zone.png", "DDDDD", 'D', 'D', "FF", "BBDD", 'X', 2, 'X'));
		listCards.add(new Card("harbor_zone.png", "DDDDD", 'D', 'D', "FF", "BBDD", 'X', 2, 'X'));
		listCards.add(new Card("human_cloning.png", "VVD", 'D', 'V', "F", "D", 'X', 1, 'X'));
		listCards.add(new Card("icebreaker.png", "NNNV", 'A', 'N', "X", "AA", 'X', 0, 'X'));
		listCards.add(new Card("icebreaker.png", "NNNV", 'A', 'N', "X", "AA", 'X', 0, 'X'));
		listCards.add(new Card("icebreaker.png", "NNNV", 'A', 'N', "X", "AA", 'X', 0, 'X'));
		listCards.add(new Card("icebreaker.png", "NNNV", 'A', 'N', "X", "AA", 'X', 0, 'X'));
		listCards.add(new Card("industrial_complex.png", "BBBN", 'D', 'B', "F", "BD", 'X', 0, 'X'));
		listCards.add(new Card("industrial_complex.png", "BBBN", 'D', 'B', "F", "BD", 'X', 0, 'X'));
		listCards.add(new Card("industrial_complex.png", "BBBN", 'D', 'B', "F", "BD", 'X', 0, 'X'));
		listCards.add(new Card("industrial_complex.png", "BBBN", 'D', 'B', "F", "BD", 'X', 0, 'X'));
		listCards.add(new Card("industrial_complex.png", "BBBN", 'D', 'B', "F", "BD", 'X', 0, 'X'));
		listCards.add(new Card("industrial_complex.png", "BBBN", 'D', 'B', "F", "BD", 'X', 0, 'X'));
		listCards.add(new Card("island_of_avalon.png", "AAAAA", 'V', 'A', "X", "V", 'X', 7, 'X'));
		listCards.add(new Card("juggernaut.png", "BBBNNNR", 'B', 'N', "GG", "AA", 'X', 1, 'N'));
		listCards.add(new Card("king_solomons_mines.png", "AAAA", 'D', 'A', "X", "D", 'B', 2, 'X'));
		listCards.add(new Card("lost_continent_of_mu.png", "AAAAAA", 'D', 'A', "RR", "D", 'X', 2, 'A'));
		listCards.add(new Card("lunar_base.png", "NNVVDDR", 'A', 'D', "GG", "X", 'X', 10, 'X'));
		listCards.add(new Card("magnetic_train.png", "NVDDD", 'D', 'D', "FF", "D", 'B', 2, 'X'));
		listCards.add(new Card("megabomb.png", "NNVV", 'N', 'V', "GG", "X", 'X', 3, 'X'));
		listCards.add(new Card("megadrill.png", "BNN", 'B', 'N', "X", "BA", 'X', 0, 'X'));
		listCards.add(new Card("megadrill.png", "BNN", 'B', 'N', "X", "BA", 'X', 0, 'X'));
		listCards.add(new Card("megadrill.png", "BNN", 'B', 'N', "X", "BA", 'X', 0, 'X'));
		listCards.add(new Card("megadrill.png", "BNN", 'B', 'N', "X", "BA", 'X', 0, 'X'));
		listCards.add(new Card("military_base.png", "BBBN", 'B', 'B', "G", "BV", 'X', 0, 'X'));
		listCards.add(new Card("military_base.png", "BBBN", 'B', 'B', "G", "BV", 'X', 0, 'X'));
		listCards.add(new Card("military_base.png", "BBBN", 'B', 'B', "G", "BV", 'X', 0, 'X'));
		listCards.add(new Card("military_base.png", "BBBN", 'B', 'B', "G", "BV", 'X', 0, 'X'));
		listCards.add(new Card("military_base.png", "BBBN", 'B', 'B', "G", "BV", 'X', 0, 'X'));
		listCards.add(new Card("military_base.png", "BBBN", 'B', 'B', "G", "BV", 'X', 0, 'X'));
		listCards.add(new Card("museum.png", "DDD", 'A', 'D', "X", "X", 'X', 2, 'A'));
		listCards.add(new Card("museum.png", "DDD", 'A', 'D', "X", "X", 'X', 2, 'A'));
		listCards.add(new Card("national_monument.png", "BBBBBDDD", 'D', 'D', "X", "X", 'X', 2, 'D'));
		listCards.add(new Card("neuroscience.png", "VVV", 'V', 'V', "X", "V", 'V', 1, 'X'));
		listCards.add(new Card("nuclear_plant.png", "BBBBV", 'N', 'B', "X", "NNN", 'X', 0, 'X'));
		listCards.add(new Card("nuclear_plant.png", "BBBBV", 'N', 'B', "X", "NNN", 'X', 0, 'X'));
		listCards.add(new Card("nuclear_plant.png", "BBBBV", 'N', 'B', "X", "NNN", 'X', 0, 'X'));
		listCards.add(new Card("nuclear_plant.png", "BBBBV", 'N', 'B', "X", "NNN", 'X', 0, 'X'));
		listCards.add(new Card("nuclear_plant.png", "BBBBV", 'N', 'B', "X", "NNN", 'X', 0, 'X'));
		listCards.add(new Card("offshore_oil_rig.png", "BBBA", 'N', 'B', "F", "ND", 'X', 0, 'X'));
		listCards.add(new Card("offshore_oil_rig.png", "BBBA", 'N', 'B', "F", "ND", 'X', 0, 'X'));
		listCards.add(new Card("offshore_oil_rig.png", "BBBA", 'N', 'B', "F", "ND", 'X', 0, 'X'));
		listCards.add(new Card("offshore_oil_rig.png", "BBBA", 'N', 'B', "F", "ND", 'X', 0, 'X'));
		listCards.add(new Card("offshore_oil_rig.png", "BBBA", 'N', 'B', "F", "ND", 'X', 0, 'X'));
		listCards.add(new Card("parallel_dimension.png", "VVVAAAAG", 'A', 'A', "RRR", "X", 'X', 3, 'V'));
		listCards.add(new Card("polar_base.png", "NNNDDDD", 'A', 'D', "G", "AAA", 'X', 2, 'A'));
		listCards.add(new Card("propaganda_center.png", "DDD", 'D', 'D', "G", "D", 'D', 1, 'X'));
		listCards.add(new Card("propaganda_center.png", "DDD", 'D', 'D', "G", "D", 'D', 1, 'X'));
		listCards.add(new Card("quantum_generator.png", "VVVVV", 'N', 'V', "X", "NNN", 'X', 1, 'N'));
		listCards.add(new Card("recycling_plant.png", "BB", 'B', 'B', "X", "BB", 'X', 0, 'X'));
		listCards.add(new Card("recycling_plant.png", "BB", 'B', 'B', "X", "BB", 'X', 0, 'X'));
		listCards.add(new Card("recycling_plant.png", "BB", 'B', 'B', "X", "BB", 'X', 0, 'X'));
		listCards.add(new Card("recycling_plant.png", "BB", 'B', 'B', "X", "BB", 'X', 0, 'X'));
		listCards.add(new Card("recycling_plant.png", "BB", 'B', 'B', "X", "BB", 'X', 0, 'X'));
		listCards.add(new Card("recycling_plant.png", "BB", 'B', 'B', "X", "BB", 'X', 0, 'X'));
		listCards.add(new Card("recycling_plant.png", "BB", 'B', 'B', "X", "BB", 'X', 0, 'X'));
		listCards.add(new Card("research_center.png", "BBBN", 'V', 'B', "X", "VV", 'X', 0, 'X'));
		listCards.add(new Card("research_center.png", "BBBN", 'V', 'B', "X", "VV", 'X', 0, 'X'));
		listCards.add(new Card("research_center.png", "BBBN", 'V', 'B', "X", "VV", 'X', 0, 'X'));
		listCards.add(new Card("research_center.png", "BBBN", 'V', 'B', "X", "VV", 'X', 0, 'X'));
		listCards.add(new Card("research_center.png", "BBBN", 'V', 'B', "X", "VV", 'X', 0, 'X'));
		listCards.add(new Card("research_center.png", "BBBN", 'V', 'B', "X", "VV", 'X', 0, 'X'));
		listCards.add(new Card("research_center.png", "BBBN", 'V', 'B', "X", "VV", 'X', 0, 'X'));
		listCards.add(new Card("robotic_animals.png", "NVV", 'N', 'V', "G", "B", 'X', 2, 'X'));
		listCards.add(new Card("robot_assistants.png", "VVV", 'B', 'V', "X", "B", 'B', 1, 'X'));
		listCards.add(new Card("roswell.png", "AAAAAA", 'V', 'A', "G", "V", 'X', 1, 'G'));
		listCards.add(new Card("satellites.png", "NNVVVV", 'A', 'V', "G", "AA", 'X', 3, 'X'));
		listCards.add(new Card("saucer_squadron.png", "NNNVV", 'V', 'N', "X", "AAA", 'X', 0, 'X'));
		listCards.add(new Card("saucer_squadron.png", "NNNVV", 'V', 'N', "X", "AAA", 'X', 0, 'X'));
		listCards.add(new Card("secret_laboratory.png", "BBDDD", 'V', 'A', "R", "VV", 'X', 1, 'V'));
		listCards.add(new Card("secret_laboratory.png", "BBDDD", 'V', 'A', "R", "VV", 'X', 1, 'V'));
		listCards.add(new Card("secret_society.png", "DDDR", 'D', 'D', "X", "X", 'X', 1, 'F'));
		listCards.add(new Card("secret_society.png", "DDDR", 'D', 'D', "X", "X", 'X', 1, 'F'));
		listCards.add(new Card("security_automatons.png", "VVVVD", 'D', 'V', "X", "X", 'X', 1, 'G'));
		listCards.add(new Card("solar_cannon.png", "NNVDDD", 'N', 'D', "G", "X", 'X', 1, 'G'));
		listCards.add(new Card("space_elevator.png", "NNNVDD", 'N', 'D', "F", "X", 'X', 1, 'F'));
		listCards.add(new Card("submarine.png", "BBNNN", 'B', 'N', "G", "AA", 'X', 0, 'X'));
		listCards.add(new Card("submarine.png", "BBNNN", 'B', 'N', "G", "AA", 'X', 0, 'X'));
		listCards.add(new Card("submarine.png", "BBNNN", 'B', 'N', "G", "AA", 'X', 0, 'X'));
		listCards.add(new Card("supercomputer.png", "VVVV", 'V', 'V', "X", "V", 'X', 1, 'N'));
		listCards.add(new Card("supersoldiers.png", "VVVVVVV", 'A', 'V', "G", "X", 'X', 1, 'G'));
		listCards.add(new Card("supersonar.png", "VVVV", 'A', 'V', "X", "A", 'N', 1, 'X'));
		listCards.add(new Card("tank_division.png", "BNN", 'B', 'N', "G", "A", 'X', 0, 'X'));
		listCards.add(new Card("tank_division.png", "BNN", 'B', 'N', "G", "A", 'X', 0, 'X'));
		listCards.add(new Card("tank_division.png", "BNN", 'B', 'N', "G", "A", 'X', 0, 'X'));
		listCards.add(new Card("tank_division.png", "BNN", 'B', 'N', "G", "A", 'X', 0, 'X'));
		listCards.add(new Card("tank_division.png", "BNN", 'B', 'N', "G", "A", 'X', 0, 'X'));
		listCards.add(new Card("tank_division.png", "BNN", 'B', 'N', "G", "A", 'X', 0, 'X'));
		listCards.add(new Card("tank_division.png", "BNN", 'B', 'N', "G", "A", 'X', 0, 'X'));
		listCards.add(new Card("teleportation.png", "VVVVVVVV", 'A', 'V', "RR", "X", 'X', 8, 'X'));
		listCards.add(new Card("time_travel.png", "VVVVVRRR", 'A', 'V', "X", "X", 'X', 15, 'X'));
		listCards.add(new Card("bermuda_triangle.png", "AAAA", 'V', 'A', "R", "V", 'X', 4, 'X'));
		listCards.add(new Card("wind_turbines.png", "BB", 'N', 'B', "X", "N", 'X', 0, 'X'));
		listCards.add(new Card("wind_turbines.png", "BB", 'N', 'B', "X", "N", 'X', 0, 'X'));
		listCards.add(new Card("wind_turbines.png", "BB", 'N', 'B', "X", "N", 'X', 0, 'X'));
		listCards.add(new Card("wind_turbines.png", "BB", 'N', 'B', "X", "N", 'X', 0, 'X'));
		listCards.add(new Card("wind_turbines.png", "BB", 'N', 'B', "X", "N", 'X', 0, 'X'));
		listCards.add(new Card("wind_turbines.png", "BB", 'N', 'B', "X", "N", 'X', 0, 'X'));
		listCards.add(new Card("wind_turbines.png", "BB", 'N', 'B', "X", "N", 'X', 0, 'X'));
		listCards.add(new Card("world_congress.png", "DDDDDDFF", 'D', 'D', "X", "X", 'X', 3, 'D'));
		listCards.add(new Card("zeppelin.png", "NN", 'A', 'N', "X", "A", 'X', 0, 'X'));
		listCards.add(new Card("zeppelin.png", "NN", 'A', 'N', "X", "A", 'X', 0, 'X'));
		listCards.add(new Card("zeppelin.png", "NN", 'A', 'N', "X", "A", 'X', 0, 'X'));
		listCards.add(new Card("zeppelin.png", "NN", 'A', 'N', "X", "A", 'X', 0, 'X'));
		listCards.add(new Card("zeppelin.png", "NN", 'A', 'N', "X", "A", 'X', 0, 'X'));
		listCards.add(new Card("zeppelin.png", "NN", 'A', 'N', "X", "A", 'X', 0, 'X'));
		
		listFactions.add(new Faction("Aztec_Empire_A.jpg", "NNA", 3, 'A'));
		listFactions.add(new Faction("Federation_Of_Asia_A.jpg", "BDD", 2, 'D'));
		listFactions.add(new Faction("Noram_States_A.jpg", "BBBD", 1, 'F'));
		listFactions.add(new Faction("Panafrican_Union_A.jpg", "BBVV", 2, 'V'));
		listFactions.add(new Faction("Republic_of_Europe_A.jpg", "BBNV", 1, 'G'));
		
		listFactions.add(new Faction("Aztec_Empire_B.jpg", "BBNV", 0, 'X'));
		listFactions.add(new Faction("Federation_Of_Asia_B.jpg", "BBNV", 0, 'X'));
		listFactions.add(new Faction("Noram_States_B.jpg", "BBNV", 0, 'X'));
		listFactions.add(new Faction("Panafrican_Union_B.jpg", "BBNV", 0, 'X'));
		listFactions.add(new Faction("Republic_of_Europe_B.jpg", "BBNV", 0, 'X'));
	}
}
