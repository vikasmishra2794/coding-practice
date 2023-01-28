Array.prototype.arrayMap =  function(callback) {
    const result = [];
    for(let i = 0; i < this.length; i++) {
        result.push(callback(this[i], i, this));
    }
    return result;
};

Array.prototype.arrayFilter =  function(callback) {
    const result = [];
    for(let i = 0; i < this.length; i++) {
        if (callback(this[i], i, this)) {
            result.push(this[i]);
        }
    }
    return result;
};

Array.prototype.arrayFind = function(callback) {
    for(let i = 0; i < this.length; i++) {
        if (callback(this[i], i, this)) {
            return this[i];
        }
    }
};

Array.prototype.arrayReduce = function(callback, initialVal) {
    let result = initialVal;
    for(let i = 0; i < this.length; i++) {
        console.log("result:==", result);
        result = callback(result, this[i]);
    }
    return result;
};

const arr = [1,2,3,4,5];
// const data = arr.arrayReduce((acc, el) => {
//     return acc + el;
// }, 5);
// const data = arr.arrayMap((data, index) => {
//     return data * 2;
// })
// const data = arr.arrayFilter((data, index) => {
//     return ((data % 2) === 0);
// })
// const data = arr.arrayFind((data, index) => {
//     return ((data % 2) === 0);
// })
console.log(data);
console.log(arr);
// [1,2,3,4,5,6].map((data, index) => {
//     console.log(data);
// })
