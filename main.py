import transpiler

while True:
    text = input('basic > ')
    result, error = transpiler.run('<stdin>', text)

    if error: print(error.as_string())
    else: print(result)