class Circle():
	pi = 3.1416
	def __init__(self,radius=1):
		self.radius = radius
	def area(self):
		return self.radius**2*Circle.pi
	def set_radius(self, new_r):
		self.radius = new_r
myC = Circle(3)
myC.set_radius(4)
print myC.radius
print myC.area()

x = 2750 + 1707

print 4481 - x