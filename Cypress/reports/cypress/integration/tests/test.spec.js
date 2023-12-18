/// <reference types="Cypress" />

context('API testing', () => {
    beforeEach(() => {
        cy.visit('/');
        cy.fixture("slides").as("slides");
    });
    it('Test 1: carousel automatic', () => {
        cy.get('@slides').then((slides) =>  {
            for(let i = 0; i<4; i++){
                cy.get('.active img', {timeout: 10000}).should('have.attr', 'alt', slides.slides[i])    
            }
        })
    })
    it('Test 2: carousel flechita', () => {
        cy.get('@slides').then((slides) =>  {
            cy.get('.carousel-control-next-icon').as("flechita")
            for(let i = 0; i<4; i++){
                cy.get('.active img').should('have.attr', 'alt', slides.slides[i])
                cy.get('@flechita').click()
            }
        })    
    })
    it('Test 3: carousel barrita', () => {
        cy.get('@slides').then((slides) =>  {
            for(let i = 0; i<3; i++){
                cy.get('[data-slide-to="' + i + '"]').click();
                cy.get('.active img').should('have.attr', 'alt', slides.slides[i]);
            }  
        })    
    })

})