class circle:
    pi=3.14
    def __init__(self,radius):
        self.radius=radius
    def getPerimeter(self):
        print(2*self.radius*circle.pi)
    def getArea(self):
        print((self.radius**2)*circle.pi)
c1=circle(5)
c1.getArea()
c1.getPerimeter()






