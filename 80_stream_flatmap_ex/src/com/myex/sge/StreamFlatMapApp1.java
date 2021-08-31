package com.myex.sge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.myex.sge.pojo.Customer;
import com.myex.sge.pojo.Plant;
import com.myex.sge.pojo.Site;

public class StreamFlatMapApp1 {

	public static void main(String[] args) {

		List<Customer> customers = prepareCustomer();
		System.out.println(customers);
		
		//getting all site ids
		List<Integer> siteIds1 = customers.stream()
				.flatMap(customer -> customer.getSites().stream()).map(site -> site.getId()).collect(Collectors.toList());
		
		System.out.println(siteIds1);
		
		//or
		
		List<Integer> siteIds2 = customers.stream()
				.map(customer -> customer.getSites()).flatMap(sites -> sites.stream()).map(site -> site.getId())
				.collect(Collectors.toList());
		System.out.println(siteIds2);
		
		//or
		
		List<Integer> siteIds3 = customers.stream()
				.map(customer -> customer.getSites()).flatMap(Collection::stream).map(site -> site.getId())
				.collect(Collectors.toList());
		System.out.println(siteIds3);

		//---------------------------------------------
		
		//getting all plant ids
		List<Integer> plantIds1 = customers.stream()
				.flatMap(customer -> customer.getSites().stream().flatMap(site -> site.getPlants().stream()))
				.map(plant -> plant.getId()).collect(Collectors.toList());
		
		System.out.println(plantIds1);
		
		//or
		
		List<Integer> plantIds2 = customers.stream()
				.flatMap(customer -> customer.getSites().stream())	//using flatMap we will go one level down in list of list (from customer to site)
				.flatMap(site -> site.getPlants().stream())		//using flatMap we will go one level down in list of list (from site to plant)
				.map(plant -> plant.getId()).collect(Collectors.toList());
		
		System.out.println(plantIds2);
	}
	
	public static List<Customer> prepareCustomer() {
		// creating customer1
		List<Plant> plants1 = new ArrayList<>();
		plants1.add(new Plant(1, "Plant A", "Plant A Description"));
		plants1.add(new Plant(2, "Plant B", "Plant B Description"));
		plants1.add(new Plant(3, "Plant C", "Plant C Description"));

		List<Plant> plants2 = new ArrayList<>();
		plants2.add(new Plant(4, "Plant D", "Plant D Description"));
		plants2.add(new Plant(5, "Plant E", "Plant E Description"));
		plants2.add(new Plant(6, "Plant F", "Plant F Description"));

		List<Plant> plants3 = new ArrayList<>();
		plants3.add(new Plant(7, "Plant G", "Plant G Description"));
		plants3.add(new Plant(8, "Plant H", "Plant H Description"));
		plants3.add(new Plant(9, "Plant I", "Plant I Description"));

		Site site1 = new Site(1, "Site1", "Site1 address", plants1);
		Site site2 = new Site(2, "Site2", "Site2 address", plants2);
		Site site3 = new Site(3, "Site3", "Site3 address", plants3);

		List<Site> sites1 = Arrays.asList(site1, site2, site3);

		Customer customer1 = new Customer(1, "Customer1", 20, sites1);

		// creating customer2
		List<Plant> plants4 = new ArrayList<>();
		plants4.add(new Plant(10, "Plant 10", "Plant 10 Description"));
		plants4.add(new Plant(11, "Plant 11", "Plant 11 Description"));
		plants4.add(new Plant(12, "Plant 12", "Plant 12 Description"));

		List<Plant> plants5 = new ArrayList<>();
		plants5.add(new Plant(13, "Plant 13", "Plant 13 Description"));
		plants5.add(new Plant(14, "Plant 14", "Plant 14 Description"));
		plants5.add(new Plant(15, "Plant 15", "Plant 15 Description"));

		List<Plant> plants6 = new ArrayList<>();
		plants6.add(new Plant(16, "Plant 16", "Plant 16 Description"));
		plants6.add(new Plant(17, "Plant 17", "Plant 17 Description"));
		plants6.add(new Plant(18, "Plant 18", "Plant 18 Description"));

		Site site4 = new Site(4, "Site1", "Site1 address", plants4);
		Site site5 = new Site(5, "Site2", "Site2 address", plants5);
		Site site6 = new Site(6, "Site3", "Site3 address", plants6);

		List<Site> sites2 = Arrays.asList(site4, site5, site6);

		Customer customer2 = new Customer(2, "Customer2", 30, sites2);

		// creating customer3
		List<Plant> plants7 = new ArrayList<>();
		plants7.add(new Plant(19, "Plant 10", "Plant 10 Description"));
		plants7.add(new Plant(20, "Plant 11", "Plant 11 Description"));
		plants7.add(new Plant(21, "Plant 12", "Plant 12 Description"));

		List<Plant> plants8 = new ArrayList<>();
		plants8.add(new Plant(22, "Plant 13", "Plant 13 Description"));
		plants8.add(new Plant(23, "Plant 14", "Plant 14 Description"));
		plants8.add(new Plant(24, "Plant 15", "Plant 15 Description"));

		List<Plant> plants9 = new ArrayList<>();
		plants9.add(new Plant(25, "Plant 16", "Plant 16 Description"));
		plants9.add(new Plant(26, "Plant 17", "Plant 17 Description"));
		plants9.add(new Plant(27, "Plant 18", "Plant 18 Description"));

		Site site7 = new Site(7, "Site1", "Site1 address", plants4);
		Site site8 = new Site(8, "Site2", "Site2 address", plants5);
		Site site9 = new Site(9, "Site3", "Site3 address", plants6);

		List<Site> sites3 = Arrays.asList(site7, site8, site9);

		Customer customer3 = new Customer(3, "Customer3", 40, sites3);

		List<Customer> customers = Arrays.asList(customer1, customer2, customer3);

		return customers;

	}
}
