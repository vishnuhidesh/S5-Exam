# Open a file in append and read mode
with open('your_file.txt', 'a+') as file:
    # Read from the file
    file_contents = file.read()
    
    # Append data to the file
    file.write('New data to append\n')

# The file is automatically closed when the "with" block exits

# Now you can work with the contents you read
print("File Contents:")
print(file_contents)
