def monotonic_array(array):
    length = len(array)
    if length == 0:
        return True
    MI = True
    MD = True
    first = array[0]

    # if array is monotone increasing
    for i in array:
        if i < first:
            MI=False
            break
        first = i
    # if array is monotone decreasing
    first = array[0]
    for i in array:
        if i > first:
            MD=False
            break
        first = i
    return (MI or MD)
