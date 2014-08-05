#include <iostream>
typedef double ld;
ld power(int, int);
int main(int argc, char *argv[]) {
	int Value, Power;

	std::cout << "Enter a value: ";
	std::cin >> Value;
	std::cout << "Enter a power: ";
	std::cin >> Power;
	std::cout << power(Value, Power) << std::endl;
	system("pause"); //to not close console after doing first power calculation
	return 0;
}
ld power(int value, int power) {
	ld result = 1;
	for (int i = 0; i < power; ++i) {
		result *= value;
	}
	return (result);
}

Determine the memory location addressed by the following real mode Core2 register combinations:

a.) DS= 1000H and DI= 2000H


b.) DS= 2000H and SI= 1002H


c.) SS= 2300H and BP= 3200H


d.) DS= A000H and BX= 1000H


e.) SS= 2900H and SP= 3A00H
