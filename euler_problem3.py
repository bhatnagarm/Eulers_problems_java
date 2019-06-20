import math

def isPrime(number):
	i =2
	while i <math.ceil(math.sqrt(number)):
		if number%i == 0:
			return False
		i += 1
	return True


def euler_problem3(number):
	j = number-1
	while j >1:
		if number%j == 0:
			if isPrime(j):
				return j
print(euler_problem3(600851475143))
