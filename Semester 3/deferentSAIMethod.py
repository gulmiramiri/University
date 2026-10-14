class MyClass:
    class_var = "متغیر کلاس"
    
    def __init__(self):
        self.instance_var = "متغیر نمونه"
    
    def instance_method(self):
        # دسترسی به هر دو
        return f"{self.instance_var} | {self.class_var}"
    
    @classmethod
    def class_method(cls):
        # فقط دسترسی به کلاس
        return f"کلاس: {cls.class_var}"
    
    @staticmethod
    def static_method():
        # بدون دسترسی به کلاس یا نمونه
        return "متد مستقل"

obj = MyClass()
print(obj.instance_method())    # متغیر نمونه | متغیر کلاس
print(MyClass.class_method())   # کلاس: متغیر کلاس
print(MyClass.static_method())  # متد مستقل