/// <reference types="Cypress" />

context('Login test cases', () => {
    beforeEach(() => {
        cy.visit('/');
        cy.fixture("sampleData").as("datos");
    });
    it('Inicio de sesión exitoso', () => {
        cy.get('@datos').then((datos) =>{
            cy.get('[name="UserName"]').type(datos[0].name);
            cy.get('[name="Password"]').type(datos[0].alphanumeric);
            cy.get('#login').click();
            cy.get('#loginstatus').should('have.text', 'Welcome, ' + datos[0].name + '!');
        })  
    })
    it('Sin datos', () => { 
        cy.get('#login').click();
        cy.get('#loginstatus').should('have.text', 'Invalid username/password');
    })
    it('Logout', () => {
        cy.get('@datos').then((datos) =>{
            cy.get('[name="UserName"]').type(datos[0].name);
            cy.get('[name="Password"]').type(datos[0].alphanumeric);
            cy.get('#login').click();
            cy.get('#login').click();
            cy.get('#loginstatus').should('have.text', 'User logged out.');
        })  
    })
})