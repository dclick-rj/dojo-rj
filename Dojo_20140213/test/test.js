var assert = require("assert");
var celular = require("../src/celular");


describe('Celular', function(){
  describe('transformar em digitos', function(){
    it('a deve retornar 2', function(){
      assert.equal('2', celular.transformaEmDigitos('a'));
    });
    it('d deve retornar 3', function(){
      assert.equal('3', celular.transformaEmDigitos('d'));
    });
    it('g deve retornar 4', function(){
      assert.equal('4', celular.transformaEmDigitos('g'));
    });
    it('j deve retornar 5', function(){
      assert.equal('5', celular.transformaEmDigitos('j'));
    });
    it('m deve retornar 6', function(){
      assert.equal('6', celular.transformaEmDigitos('m'));
    });
    it('p deve retornar 7', function(){
      assert.equal('7', celular.transformaEmDigitos('p'));
    });
    it('t deve retornar 8', function(){
      assert.equal('8', celular.transformaEmDigitos('t'));
    });
    it('w deve retornar 9', function(){
      assert.equal('9', celular.transformaEmDigitos('w'));
    });
    it('espaço deve retornar 0', function(){
      assert.equal('0', celular.transformaEmDigitos(' '));
    });
    it('b deve retornar 22', function(){
      assert.equal('22', celular.transformaEmDigitos('b'));
    });
    it('c deve retornar 222', function(){
      assert.equal('222', celular.transformaEmDigitos('c'));
    });
    it('e deve retornar 33', function(){
      assert.equal('33', celular.transformaEmDigitos('e'));
    });
    it('f deve retornar 333', function(){
      assert.equal('333', celular.transformaEmDigitos('f'));
    });
    it('h deve retornar 44', function(){
      assert.equal('44', celular.transformaEmDigitos('h'));
    });
    it('i deve retornar 444', function(){
      assert.equal('444', celular.transformaEmDigitos('i'));
    });
    it('k deve retornar 55', function(){
      assert.equal('55', celular.transformaEmDigitos('k'));
    });
    it('l deve retornar 555', function(){
      assert.equal('555', celular.transformaEmDigitos('l'));
    });
    it('n deve retornar 66', function(){
      assert.equal('66', celular.transformaEmDigitos('n'));
    });
    it('o deve retornar 666', function(){
      assert.equal('666', celular.transformaEmDigitos('o'));
    });
    it('q deve retornar 77', function(){
      assert.equal('77', celular.transformaEmDigitos('q'));
    });
    it('r deve retornar 777', function(){
      assert.equal('777', celular.transformaEmDigitos('r'));
    });
    it('s deve retornar 7777', function(){
      assert.equal('7777', celular.transformaEmDigitos('s'));
    });

    it('u deve retornar 88', function(){
      assert.equal('88', celular.transformaEmDigitos('u'));
    });

    it('v deve retornar 888', function(){
      assert.equal('888', celular.transformaEmDigitos('v'));
    });
    it('x deve retornar 99', function(){
      assert.equal('99', celular.transformaEmDigitos('x'));
    });
    it('y deve retornar 999', function(){
      assert.equal('999', celular.transformaEmDigitos('y'));
    });
    it('z deve retornar 9999', function(){
      assert.equal('9999', celular.transformaEmDigitos('z'));
    });
	it('adg deve retornar 234', function(){
      assert.equal('234', celular.transformaEmDigitos('adg'));
    });
    it('aa deve retornar 2_2', function(){
      assert.equal('2_2', celular.transformaEmDigitos('aa'));
    });
    it('sempre acesso o dojopuzzles deve retornar 77773367_7773302_222337777_777766606660366656667889999_9999555337777', function(){
      assert.equal('77773367_7773302_222337777_777766606660366656667889999_9999555337777', celular.transformaEmDigitos('sempre acesso o dojopuzzles'));
    });

    it('bola gato deve retornar 2266655520428666', function(){
      assert.equal('2266655520428666', celular.transformaEmDigitos('bola gato'));
    });

  })
});
