
public class VariablesAndNames {
	public static void main(String[] args) {
		int cars, drivers, passengers, carsNotDriven, carsDriven;
		double spaceInACar,carpoolCapasity, averagePassengersPerCar;
		
		
		//B:
		
		//How many cars there are
		cars = 100;
		
		//How many people can fit in each car
		spaceInACar = 4;
		
		//How many drivers are present
		drivers = 30;
		
		//How many passengers are present
		passengers = 90;
		
		//How many cars are not being driven
		carsNotDriven = cars-drivers;
		
		//How many cars are being driven
		carsDriven = drivers;
		
		//How many passengers we can transport
		carpoolCapasity = carsDriven*spaceInACar;
		
		//Average passengers per car
		averagePassengersPerCar = passengers / carsDriven;
		
		System.out.println("There are " + cars + " cars avaliable.");
		System.out.println("There are only " + drivers + " drivers avaliable.");
		System.out.println("There will be " + carsNotDriven + " empty cars today.");
		System.out.println("We can transport " + carpoolCapasity + " people today.");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
		
		//A: If it is just 4, it will give the same result
		
		//C: = will set something to a specific value, while == checks if two things are the same
	}
}
