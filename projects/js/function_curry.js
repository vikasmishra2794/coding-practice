function add(...num1) {
    if (num1.length > 1) {
        const sum = num1.reduce((a, b) => a + b, 0);
        return add(sum);
    }
    return function(...num2) {
        const sum = num2.reduce((a, b) => a + b, 0);
        return sum ? add(num1[0] + sum) : num1[0];
    }
}
console.log(add(1,2,3)(4)(5)(6,7)(3,4,5)(6)());