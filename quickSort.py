# 1) Здание (по сортировке чисел). Даны числа: 80, 85, 90, 95, 100, 105, 110, 115, 120, 125.
# Написать код (любой язык программирования) по их сортировке

import random

def quickSort(D):
    if len(D) <= 1:
        return D
    else:
        q = random.choice(D)  # Выбираем случайный элемент в качестве опорного
        s_nums = []  # Элементы меньше опорного
        e_nums = []  # Элементы равные опорному
        m_nums = []  # Элементы больше опорного
        for n in D:
            if n < q:
                s_nums.append(n)
            elif n > q:
                m_nums.append(n)
            else:
                e_nums.append(n)
        # Рекурсивно сортируем подмассивы и объединяем их
        return quickSort(s_nums) + e_nums + quickSort(m_nums)

numbers = [80, 85, 90, 95, 100, 105, 110, 115, 120, 125]
sorted_numbers = quickSort(numbers)
print("Отсортированный массив:", sorted_numbers)