import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
import random

# plt.plot([1,2,3],[2,4,6])
x = np.linspace(0,2*np.pi,100)
y = np.sin(x)
plt.plot(y)
plt.title("Graph", fontdict={"fontname" : "Times New Roman"})
plt.xlabel("X Axis")
plt.ylabel("Y Axis")
plt.show()