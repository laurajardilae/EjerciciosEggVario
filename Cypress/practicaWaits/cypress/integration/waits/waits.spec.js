/// <reference types="Cypress" />

context('Login test cases', () => {
    beforeEach(() => {
        cy.visit('/');
    });
    it('Test 01: implicit wait', () => {
        cy.get('#ajaxButton').click();
        cy.wait(18000);
        cy.get('.bg-success').should('have.text','Data loaded with AJAX get request.');
    })
    it('Test 02: BDD wait', () => {
        cy.get('#ajaxButton').click();
        cy.get('.bg-success',{timeout : 25000}).should('contain.text','Data loaded with AJAX get request.');
    })
    it('Test 3: Service/Request wait',() => {
        cy.intercept("https://uitestingplayground.com/ajaxdata").as('myRequest');
        cy.get('#ajaxButton').click();
        cy.wait('@myRequest', {timeout: 20000}).its('response.statusCode').should('eq',200);
        cy.get('.bg-success').should('contain.text','Data loaded with AJAX get request.');
    })
})