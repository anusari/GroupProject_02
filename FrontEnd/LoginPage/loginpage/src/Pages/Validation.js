const Validation = (values) => {

    let errors = {}

    if(!values.name) {
        errors.name = " Username Required"
    }
    else{
        const name =  /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if(!name.test(email)){
            errors.email = "Invalid email format";
        }
    }
    
    const email = "example@gmail.com";
    const emailErrors = ValidateEmail(email);

   
    if(!values.password){
        errors.password = "Password Required"
    }
    else if(values.password.length < 8)
    {
        errors.password = "Password must be 8 characteristics ";
    }

    return errors;
}

export default Validation ;