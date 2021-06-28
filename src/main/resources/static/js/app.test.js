import { mount } from '@vue/test-utils'
import app from './app.js';
global.axios = {
    get(){return Promise.resolve({ data: [{}]})},
    post(){return Promise.resolve('')}
}

test('schould show the Ingredients', ()=> {
    const wrapper = mount(app);
    expect(wrapper.text()).toContain('Hallo')
})